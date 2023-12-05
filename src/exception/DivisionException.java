package exception;

public class DivisionException extends Exception{
    //construction de l'exception pour les expressions
    public DivisionException(String message) {
        super("\u001B[91mExpressionException: "+message+"\u001B[0m\n");
    }
}
