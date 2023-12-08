package ast;

public class Const implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public int in;
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


    public Const(int in, int line, int column){
        this.in=in;
        this.line=line;
        this.column=column;
    }

}
