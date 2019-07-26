package rules;

import states.LexerState;
import states.OperatorState;

public class OperatorBeginRule extends LexerRule {

    @Override
    public boolean test(char s) {
        return "+-*/&|%=".indexOf((int) s) != -1;
    }

    @Override
    public LexerState next(LexerState state, char c) {
        LexerState newState = new OperatorState();
        newState.appendBuffer(c);
        return newState;
    }
}
