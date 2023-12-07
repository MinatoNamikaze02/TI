package ast;

public class Typeidid  implements Ast{
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


    public String id;
    public int line;

    public int column;

    public Typeidid(String id, int line, int column){
        this.id = id;
        this.line = line;
        this.column = column;
    }
}

