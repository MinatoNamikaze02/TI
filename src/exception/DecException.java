package exception;

public class DecException extends Exception {

    //construction de l'exception pour les fonctions
    public DecException(String message) {
        super("\u001B[91mFonctionException: "+message+"\u001B[0m\n");
    }

}
