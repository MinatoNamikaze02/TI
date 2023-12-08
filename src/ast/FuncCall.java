package ast;

public class FuncCall implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public int getLine(){
        return this.line;
    }

    public int getColumn(){
        return this.column;
    }

    public int line;

    public int column;
    public Ast right;
    public String id;
    public Ast left;

    public FuncCall(String id,Ast right, int line, int column){
        this.id=id;
        this.right= right;
        this.left=null;
        this.line=line;
        this.column=column;

    }

    public FuncCall(Ast left, Ast right){
        this.left=left;
        this.right=right;
        this.id=null;
    }
}
