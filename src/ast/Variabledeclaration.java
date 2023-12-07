package ast;

public class Variabledeclaration implements Ast{
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
    public Ast bis;
    public int line;

    public int column;



    public Variabledeclaration(String id, Ast bis, int line, int column){
        this.id = id;
        this.bis = bis;
        this.line = line;
        this.column = column;
    }
}