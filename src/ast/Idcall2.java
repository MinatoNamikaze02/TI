package ast;

public class Idcall2 implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public String id;
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


    public Idcall2(String id, int line, int column){
        this.id=id;
        this.line=line;
        this.column=column;
    }
}