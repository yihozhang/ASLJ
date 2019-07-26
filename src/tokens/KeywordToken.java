package tokens;

import java.util.*;

public class KeywordToken extends Token {

    public enum KeywordType {
        IF, FOR, WHILE, VOID, THIS, NEW, SUPER, THROWS,
        PUBLIC, PRIVATE, PROTECTED, STATIC, FINAL,
        IMPORT, PACKAGE, CLASS, ENUM
    }


    public static final Map<String, KeywordType> KEYWORDS;
    static {
        Map<String, KeywordType> map = new HashMap<>();
        map.put("if", KeywordType.IF);
        map.put("for", KeywordType.FOR);
        map.put("while", KeywordType.WHILE);
        map.put("void", KeywordType.VOID);
        map.put("this", KeywordType.THIS);
        map.put("new", KeywordType.NEW);
        map.put("super", KeywordType.SUPER);
        map.put("throws", KeywordType.THROWS);
        map.put("public", KeywordType.PUBLIC);
        map.put("private", KeywordType.PRIVATE);
        map.put("protected", KeywordType.PROTECTED);
        map.put("static", KeywordType.STATIC);
        map.put("final", KeywordType.FINAL);
        map.put("import", KeywordType.IMPORT);
        map.put("package", KeywordType.PACKAGE);
        map.put("class", KeywordType.CLASS);
        map.put("enum", KeywordType.ENUM);
        KEYWORDS = map;
    };

    private KeywordType keywordType;

    public KeywordToken(String s) {
        keywordType = KEYWORDS.get(s);
    }

    public String toString() {
        return "[KW: " + keywordType +"]";
    }
}
