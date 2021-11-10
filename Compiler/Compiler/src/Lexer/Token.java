package Lexer;


/**
 * Classe Token define o lexema individualmente
 */
public class Token {
    public final int tag;

    public Token(int tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Token ["+ (char) tag + "]";
    }
}
