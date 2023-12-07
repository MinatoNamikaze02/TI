package ast;

public class Field implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public Ast expr;
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


    public Field(Ast expr, String id, int line, int column){
        this.expr = expr;
        this.id = id;
        this.line = line;
        this.column = column;
    }
}