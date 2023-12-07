package ast;

public class Typegal implements Ast{
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


    public Ast typeid;
    public String eg;
    public Ast expr;
    public int line;

    public int column;

    public Typegal( Ast typeid, String eg, Ast expr, int line, int column){
        this.typeid = typeid;
        this.eg = eg;
        this.expr = expr;
        this.line = line;
        this.column = column;
    }

}
