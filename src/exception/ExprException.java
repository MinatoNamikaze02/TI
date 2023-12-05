package exception;

public class ExprException extends Exception {

    //construction de l'exception pour les expressions
    public ExprException(String message) {
        super("\u001B[91mExpressionException: "+message+"\u001B[0m\n");
    }
}
