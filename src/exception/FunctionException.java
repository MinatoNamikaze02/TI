package exception;

public class FunctionException extends Exception {

    public FunctionException(String message) {
        super("\u001B[91mFunctionException: "+message+"\u001B[0m\n");
    }
}
