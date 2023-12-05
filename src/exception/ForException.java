package exception;

public class ForException extends Exception{
    //construction de l'exception pour les expressions
    public ForException(String message) {
        super("\u001B[91mForException: "+message+"\u001B[0m\n");
    }
}
