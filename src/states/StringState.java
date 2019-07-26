package states;

import rules.OperatorBeginRule;
import rules.StringEndRule;
import tokens.StringToken;

public class StringState extends LexerState {
    public StringState() {
        super();
        appendRule(new StringEndRule());
        appendRule(new OperatorBeginRule());
    }

    @Override
    public void emitNow() {
        this.globalEmitter.emit(new StringToken(this.store.toString()));
    }
}
