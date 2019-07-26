package rules;

import states.ConcreteState;
import states.LexerState;
import tokens.TokenEmitter;

abstract public class LexerRule {
    public abstract boolean test(char s);
    public LexerState next(LexerState state, char c) {
        LexerState newState = new ConcreteState();
        return newState.consume(c);
    }
    public LexerState next(LexerState state, char c, TokenEmitter e) {
        return next(state, c);
    }
}
