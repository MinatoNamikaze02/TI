package ast;

public class Div implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public int getLine(){
        return this.ligne;
    }

    public int getColumn(){
        return this.colonne;
    }

    public Ast left;
    public Ast right;
    public int ligne;

    public int colonne;


    public Div(Ast left, Ast right, int ligne, int colonne) {
        this.left = left;
        this.right = right;
        this.ligne = ligne;
        this.colonne = colonne;
    }
}
