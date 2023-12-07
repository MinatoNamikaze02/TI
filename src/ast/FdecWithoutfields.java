package ast;

public class FdecWithoutfields implements Ast{


    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
   public String id;
   public Ast functiondeclaration;
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

    public FdecWithoutfields(String id, Ast functiondeclaration, int line, int column){
        this.id = id;
        this.functiondeclaration = functiondeclaration;
        this.line = line;
        this.column = column;

    }

}