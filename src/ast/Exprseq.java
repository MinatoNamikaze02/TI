package ast;

import java.util.ArrayList;

public class Exprseq implements Ast{


    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public ArrayList<Ast> expr;
    public int line;

    public int column;
    @Override
    public int getLine() {
        return this.line;
    }

    @Override
    public int getColumn() {
        return this.column;
    }


    public Exprseq(ArrayList<Ast> expr, int line, int column){
        this.expr = expr;
        this.line = line;
        this.column = column;
    }

}
