package tokens;

public class StringToken extends Token{
    private String value;
    public StringToken(String s) {
        value = s;
    }

    @Override
    public String toString() {
        return "[STR: " + value + "]";
    }
}
