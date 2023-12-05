package ast;

public class Egal implements Ast{

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public int getLine(){
        return this.ligne;
    }

    public int getColumn(){
        return this.colonne;
    }

    public String eg;
    public Ast expr;
    public int ligne;

    public int colonne;

    public Egal(String eg, Ast expr, int ligne, int colonne){
        this.eg = eg;
        this.expr = expr;
        this.ligne = ligne;
        this.colonne = colonne;
    }
}