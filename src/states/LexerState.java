package states;

import rules.LexerRule;
import tokens.TokenEmitter;

import java.util.ArrayList;
import java.util.List;

public abstract class LexerState {
    protected static TokenEmitter globalEmitter;

    public static void setGlobalEmitter(TokenEmitter tokenEmitter) {
        globalEmitter = tokenEmitter;
    }

    public static LexerState concreteMode() {
        return new ConcreteState();
    }

    public static LexerState stringMode() {
        return new StringState();
    }

    public abstract void emitNow();

    protected StringBuilder store;
    private List<LexerRule> rules;

    public LexerState() {
        store = new StringBuilder();
        rules = new ArrayList<>();
    }

    public void appendRule(LexerRule rule) {
        rules.add(rule);
    }

    public void appendBuffer(String s) {
        store.append(s);
    }

    public void appendBuffer(char s) {
        store.append(s);
    }

    public LexerState consume(char c) {
        for (LexerRule rule: rules) {
            if (rule.test(c)) {
                emitNow();
                store = new StringBuilder(); // clean up string builder
                return rule.next(this, c, globalEmitter);
            }
        }
        store.append(c);
        return this;
    }
}
