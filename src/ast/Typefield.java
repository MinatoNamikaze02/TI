package ast;

public class Typefield implements Ast{
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
    public Ast type;
    public int line;

    public int column;

    public Typefield(String id, Ast type, int line, int column){
        this.id = id;
        this.type = type;
        this.line = line;
        this.column = column;
    }
}

