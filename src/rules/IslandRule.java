package rules;

import states.LexerState;

public class IslandRule extends LexerRule {

    @Override
    public boolean test(char s) {
        return s == ' ' || s == '\t' || s == '\n';
    }

    @Override
    public LexerState next(LexerState state, char c) {
        return LexerState.concreteMode();
    }
}
