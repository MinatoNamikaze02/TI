package ast;

public class Typepredefined  implements Ast{

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

    public String type;
    public int line;

    public int column;

    public Typepredefined(String type, int line, int column){
        this.type = type;
        this.line = line;
        this.column = column;
    }
}

