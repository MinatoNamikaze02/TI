package ast;

public class For implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public String id;
    public Ast min;
    public Ast max;
    public Ast regle;
    public int line;

    public int column;

    public For(String id, Ast min, Ast max, Ast regle, int line, int column){
        this.id=id;
        this.min=min;
        this.max=max;
        this.regle=regle;
        this.line=line;
        this.column=column;
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
