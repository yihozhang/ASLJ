package states;

import rules.IslandRule;
import rules.OperatorEndRule;
import tokens.OperatorToken;

public class OperatorState extends LexerState {
    public OperatorState() {
        super();
        appendRule(new IslandRule());
        appendRule(new OperatorEndRule());
    }

    @Override
    public void emitNow() {
        this.globalEmitter.emit(new OperatorToken(this.store.toString()));
    }
}
