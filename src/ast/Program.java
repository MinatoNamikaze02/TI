package ast;

public class Program implements Ast{

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


    public Ast expression;
    public int line;

    public int column;

    public Program(Ast expression, int line, int column){
        this.expression=expression;
        this.line=line;
        this.column=column;
    }

}
