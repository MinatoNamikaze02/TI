package ast;

public class Croexpr implements Ast{
    
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public int getLine(){
        return this.ligne;
    }

    public int getColumn(){
        return this.colonne;
    }
    
    public Ast expr;
    public Ast lvaluebis;
    public int ligne;

    public int colonne;

    public Croexpr (Ast expr, Ast lvaluebi, int ligne, int colonne){
        this.expr = expr;
        this.lvaluebis = lvaluebi;
        this.ligne = ligne;
        this.colonne = colonne;
    }
}