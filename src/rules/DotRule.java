package rules;

import states.ConcreteState;
import states.LexerState;
import tokens.DotToken;
import tokens.TokenEmitter;

public class DotRule extends LexerRule {

    @Override
    public boolean test(char s) {
        return s == '.';
    }

    @Override
    public LexerState next(LexerState state, char c, TokenEmitter e) {
        e.emit(new DotToken());
        return new ConcreteState();
    }
}
