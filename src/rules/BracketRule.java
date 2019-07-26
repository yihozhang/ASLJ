package rules;

import states.ConcreteState;
import states.LexerState;
import tokens.BracketToken;
import tokens.TokenEmitter;

public class BracketRule extends LexerRule {
    @Override
    public boolean test(char s) {
        return "{[(<>)]}".indexOf(s) != -1;
    }

    @Override
    public LexerState next(LexerState state, char c, TokenEmitter e) {
        e.emit(new BracketToken(c));
        return new ConcreteState();
    }
}
