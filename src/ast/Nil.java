package ast;

public class Nil implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }


    public String ni;
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

    public Nil(String ni, int line, int column) {
        this.ni=ni;
        this.line=line;
        this.column=column;
    }

}
