package ast;

public class IfThen implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast left;
    public Ast center;
    public Ast right;
    public int line;

    public int column;
    public IfThen(Ast left, Ast center, Ast right, int line, int column){
        this.left=left;
        this.center=center;
        this.right = right;
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
