package tokens;

public class BracketToken extends Token {
    enum BracketType {
        LEFT_ROUND, RIGHT_ROUND,
        LEFT_SQUARE, RIGHT_SQUARE,
        LEFT_CURLY, RIGHT_CURLY,
        LEFT_ANGLE, RIGHT_ANGLE;
    }

    private BracketType bracketType;
    public BracketToken(char s) {
        if (s == '(') bracketType = BracketType.LEFT_ROUND;
        else if (s == ')') bracketType = BracketType.RIGHT_ROUND;
        else if (s == '[') bracketType = BracketType.LEFT_SQUARE;
        else if (s == ']') bracketType = BracketType.RIGHT_SQUARE;
        else if (s == '{') bracketType = BracketType.LEFT_CURLY;
        else if (s == '}') bracketType = BracketType.RIGHT_CURLY;
        else if (s == '<') bracketType = BracketType.LEFT_ANGLE;
        else if (s == '>') bracketType = BracketType.RIGHT_ANGLE;
        else throw new IllegalArgumentException("bracket type not supported");
    }

    @Override
    public String toString() {
        return "[BR: " + bracketType + "]";
    }
}
