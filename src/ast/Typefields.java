package ast;

import java.util.ArrayList;

public class Typefields implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    @Override
    public int getLine() {
        return this.line;
    }

    @Override
    public int getColumn() {
        return this.column;
    }

    public ArrayList<Ast> typefield;
    public int line;

    public int column;



    public Typefields(ArrayList<Ast> list, int line, int column){
        this.typefield = list;
        this.line = line;
        this.column = column;
    }
}

