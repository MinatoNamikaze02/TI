package ast;

public class Dptegal implements Ast{

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }

    // Utile
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast left;
    public Ast right;
    public int ligne;

    public int colonne;


    public Dptegal(Ast left, Ast right, int ligne, int colonne) {
        this.left = left;
        this.right = right;
        this.ligne = ligne;
        this.colonne = colonne;
    }
    



}
