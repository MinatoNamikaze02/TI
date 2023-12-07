package exception;

public class DecException extends Exception {
    public DecException(String message) {
        super("\u001B[91mDeclarationException: "+message+"\u001B[0m\n");
    }

}
