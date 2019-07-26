package tokens;

public class OperatorToken extends Token {
    private String value;

    public OperatorToken(String s) {
        value = s;
    }

    @Override
    public String toString() {
        return "[OP: " + value + "]";
    }
}
