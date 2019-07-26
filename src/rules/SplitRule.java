package rules;

import states.ConcreteState;
import states.LexerState;
import tokens.SplitToken;
import tokens.TokenEmitter;

public class SplitRule extends LexerRule {

    @Override
    public boolean test(char s) {
        return s == ';';
    }

    @Override
    public LexerState next(LexerState state, char c, TokenEmitter e) {
        e.emit(new SplitToken());
        return new ConcreteState();
    }
}
