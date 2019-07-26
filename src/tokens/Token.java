package tokens;

abstract public class Token {
    public static Token createFromString(String s) {
        if (KeywordToken.KEYWORDS.containsKey(s)) {
            return new KeywordToken(s);
        } else {
            return new IdentifierToken(s);
        }
    }
}
