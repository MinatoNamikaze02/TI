package ast;

public class Vardec1 implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast expr;
    public Ast typeid;
    public int line;

    public int column;


    public Vardec1(Ast typeid, Ast expr, int line, int column) {
        this.expr = expr;
        this.typeid = typeid;
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
