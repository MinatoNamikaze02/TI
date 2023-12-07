package ast;

public class Break implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public int getLine(){
        return this.line;
    }

    public int getColumn(){
        return this.column;
    }
    public String coup;
    public int line;

    public int column;

    public Break(String coup, int line, int column){
        this.coup=coup;
        this.line=line;
        this.column=column;
    }

}
