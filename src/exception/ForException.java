package exception;

public class ForException extends Exception{
    public ForException(String message) {
        super("\u001B[91mForException: "+message+"\u001B[0m\n");
    }
}
