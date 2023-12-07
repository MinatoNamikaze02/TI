package exception;

public class ExprException extends Exception {

    public ExprException(String message) {
        super("\u001B[91mExpressionException: "+message+"\u001B[0m\n");
    }
}
