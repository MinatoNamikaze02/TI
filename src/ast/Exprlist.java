package ast;

import java.util.ArrayList;

public class Exprlist implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public ArrayList<Ast> expr;
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


    public Exprlist(ArrayList<Ast> expr, int ligne, int colonne){
        this.expr = expr;
        this.ligne = ligne;
        this.colonne = colonne;
    }

}
