package ast;
import java.util.ArrayList;

public class Let implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public ArrayList<Ast> lefts;
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


    public Let(Ast right, int line, int column){
        this.lefts= new ArrayList<>();
        this.right=right;
        this.line=line;
        this.column=column;
    }

    public void add_Ast(Ast left){
        this.lefts.add(left);
    }
}
