package tokens;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TokenEmitter {
    private List<Token> tokens;

    public TokenEmitter() {
        tokens = new ArrayList();
    }

    public void emit(Token token) {
        tokens.add(token);
    }

    @Override
    public String toString() {
        if (tokens.isEmpty()) {
            return "Tokens: []";
        } else {
            Iterator<Token> it = tokens.iterator();
            StringBuilder s = new StringBuilder("Tokens: [" + it.next());
            while (it.hasNext()) {
                s.append(", " + it.next());
            }
            s.append("]");
            return s.toString();
        }
    }
}
