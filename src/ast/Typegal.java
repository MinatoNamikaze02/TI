package ast;

public class Typegal implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    @Override
    public int getLine() {
        return this.ligne;
    }

    @Override
    public int getColumn() {
        return this.colonne;
    }


    public Ast typeid;
    public String eg;
    public Ast expr;
    public int ligne;

    public int colonne;

    public Typegal( Ast typeid, String eg, Ast expr, int ligne, int colonne){
        this.typeid = typeid;
        this.eg = eg;
        this.expr = expr;
        this.ligne = ligne;
        this.colonne = colonne;
    }

}
