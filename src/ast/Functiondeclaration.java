package ast;

public class Functiondeclaration implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
   public String id;
   public Ast typefields;
   public Ast functiondeclaration;
    public int line;

    public int column;

    public Functiondeclaration(String id, Ast typefields, Ast functiondeclaration, int line, int column){
        this.id = id;
        this.typefields = typefields;
        this.functiondeclaration = functiondeclaration;
        this.line = line;
        this.column = column;
    }
    @Override
    public int getLine() {
        return this.line;
    }

    @Override
    public int getColumn() {
        return this.column;
    }

}
