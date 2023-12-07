package ast;

public class Typeswithfieldlist implements Ast{

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast typeid;
    public Ast fieldlist;
    public int line;

    public int column;

    public Typeswithfieldlist(Ast typeid, Ast fieldlist, int line, int column){
        this.typeid = typeid;
        this.fieldlist = fieldlist;
        this.line = line;
        this.column = column;
    }

    @Override
    public int getLine() {
        return this.line;
    }

    @Override
    public int getColumn() {
        return this.column;
    }


}
