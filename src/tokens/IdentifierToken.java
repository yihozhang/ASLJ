package tokens;

public class IdentifierToken extends Token {
    private String value;
    public IdentifierToken(String s) {
        value = s;
    }

    @Override
    public String toString() {
        return "[ID: " + value + "]";
    }
}
