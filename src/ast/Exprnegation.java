package ast;

public class Exprnegation implements Ast{

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public String neg;
    public Ast expr;
    public int ligne;

    public int colonne;

    @Override
    public int getLine() {
        return this.ligne;
    }

    @Override
    public int getColumn() {
        return this.colonne;
    }


    public Exprnegation(String neg, Ast expr, int ligne, int colonne){
        this.neg = neg;
        this.expr = expr;
        this.ligne = ligne;
        this.colonne = colonne;
    }

}
