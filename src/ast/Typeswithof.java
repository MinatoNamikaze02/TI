package ast;

public class Typeswithof implements Ast{

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
    public String of;
    public Ast typeid;
    public Ast expr1;
    public Ast expr2;
    public int line;

    public int column;


    public Typeswithof(String of, Ast typeid, Ast expr1, Ast expr2, int line, int column){
        this.of = of;
        this.typeid = typeid;
        this.expr1 = expr1;
        this.expr2 = expr2;
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

