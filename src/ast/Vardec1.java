package ast;

public class Vardec1 implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast expr;
    public Ast typeid;
    public int ligne;

    public int colonne;

    public Vardec1(Ast typeid, Ast expr, int ligne, int colonne) {
        this.expr = expr;
        this.typeid = typeid;
        this.ligne = ligne;
        this.colonne = colonne;

    }
    @Override
    public int getLine() {
        return this.ligne;
    }

    @Override
    public int getColumn() {
        return this.colonne;
    }

}
