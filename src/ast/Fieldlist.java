package ast;

import java.util.ArrayList;


public class Fieldlist implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public ArrayList<Ast> field;
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


    public Fieldlist(ArrayList<Ast> field, int line, int column){
        this.field = field;
        this.line = line;
        this.column = column;
    }

}