package ast;

public class Strin  implements Ast{
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

    public String strin;
    public int line;

    public int column;

    public Strin(String strin, int line, int column){
        this.strin=strin.replace(String.valueOf('"'),String.valueOf("\\"+'"'));
        this.line=line;
        this.column=column;
    }
}
