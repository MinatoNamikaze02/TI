package ast;

public class Typedeclaration implements Ast{
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


    public Ast type;
    public Ast typeid;
    public int line;

    public int column;

    public Typedeclaration (Ast typeid, Ast type, int line, int column){
        this.typeid = typeid;
        this.type = type;
        this.line = line;
        this.column = column;
    }
}

