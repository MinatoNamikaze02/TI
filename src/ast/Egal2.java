package ast;

public class Egal2 implements Ast{

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }


    public Ast left;
    public Ast right;
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


    public Egal2(Ast left, Ast right, int line, int column) {
        this.left = left;
        this.right = right;
        this.line = line;
        this.column = column;
    }
    



}
