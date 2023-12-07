package exception;

public class DivisionException extends Exception{
    public DivisionException(String message) {
        super("\u001B[91mDivisionException: "+message+"\u001B[0m\n");
    }
}
