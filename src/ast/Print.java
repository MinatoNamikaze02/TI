package ast;

public class Print implements Ast {
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

    public Ast fils;
    public int line;

    public int column;

    public Print( Ast fils, int line, int column){
        this.fils=fils;
        this.line=line;
        this.column=column;
    }
}
