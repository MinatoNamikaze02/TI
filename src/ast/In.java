package ast;

public class In implements Ast{
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


    public In(int in, int line, int column){
        this.in=in;
        this.line=line;
        this.column=column;
    }

}
