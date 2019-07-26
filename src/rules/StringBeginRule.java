package rules;

import states.LexerState;
import states.StringState;
import tokens.TokenEmitter;

public class StringBeginRule extends LexerRule {
    @Override
    public boolean test(char s) {
        return s == '\"';
    }

    @Override
    public LexerState next(LexerState state, char c) {
        return LexerState.stringMode();
    }

}
