package ast;

public class AccessVar implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public int line;

    public int column;
    public Ast right;
    public String id;
    public Ast left;

    public AccessVar(String id,Ast right,int line,int column){
        this.id=id;
        this.right= right;
        this.left=null;
        this.line = line;
        this.column =column;
    }

    public AccessVar(Ast left, Ast right, int line, int column){
        this.left=left;
        this.right=right;
        this.id=null;
        this.line = line;
        this.column = column;
    }

    public int getLine(){
        return this.line;
    }

    public int getColumn(){
        return this.column;
    }
}
