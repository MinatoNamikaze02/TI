package ast;

public class Brack implements Ast{
    
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public int getLine(){
        return this.line;
    }

    public int getColumn(){
        return this.column;
    }
    
    public Ast expr;
    public Ast lvaluebis;
    public int line;

    public int column;

    public Brack(Ast expr, Ast lvaluebi, int line, int column){
        this.expr = expr;
        this.lvaluebis = lvaluebi;
        this.line = line;
        this.column = column;
    }
}