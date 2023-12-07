package ast;

public class Pointid implements Ast{
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
    public String fils;
    public Ast left;
    public int line;

    public int column;

    public Pointid (String id, String fils, int line, int column){
        this.id = id;
        this.fils = fils;
        this.left = null;
        this.line = line;
        this.column = column;
    }

    public Pointid (Ast left, String fils, int line, int column){
        this.left = left;
        this.fils = fils;
        this.id = null;
        this.line = line;
        this.column = column;
    }
}