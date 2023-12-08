package ast;

public class Equal implements Ast{

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public int getLine(){
        return this.line;
    }

    public int getColumn(){
        return this.column;
    }

    public String eg;
    public Ast expr;
    public int line;

    public int column;
    public Equal(String eg, Ast expr, int line, int column){
        this.eg = eg;
        this.expr = expr;
        this.line = line;
        this.column = column;
    }
}