package rules;

import states.ConcreteState;
import states.LexerState;

public class StringEndRule extends LexerRule {
    @Override
    public boolean test(char s) {
        return s == '\"';
    }

    @Override
    public LexerState next(LexerState state, char c) {
        return new ConcreteState();
    }

}
