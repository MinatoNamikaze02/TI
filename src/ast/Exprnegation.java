package ast;

public class Exprnegation implements Ast{

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public String neg;
    public Ast expr;
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


    public Exprnegation(String neg, Ast expr, int line, int column){
        this.neg = neg;
        this.expr = expr;
        this.line = line;
        this.column = column;
    }

}
