package states;

import rules.*;
import tokens.IdentifierToken;
import tokens.Token;

public class ConcreteState extends LexerState {

    public ConcreteState() {
        super();
        appendRule(new StringBeginRule());
        appendRule(new IslandRule());
        appendRule(new OperatorBeginRule());
        appendRule(new BracketRule());
        appendRule(new SplitRule());
        appendRule(new DotRule());
    }

    @Override
    public void emitNow() {
        if (this.store.length() > 0) {
            this.globalEmitter.emit(Token.createFromString(this.store.toString()));
        }
    }
}
