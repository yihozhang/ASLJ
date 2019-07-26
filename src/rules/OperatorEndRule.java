package rules;

import states.ConcreteState;
import states.LexerState;

public class OperatorEndRule extends LexerRule {
    @Override
    public boolean test(char c) {
        return "+-*/&|%".indexOf((int) c) == -1;
    }

    @Override
    public LexerState next(LexerState state, char c) { // let consume state to make decision for us
        LexerState newState = new ConcreteState();
        return newState.consume(c);
    }
}
