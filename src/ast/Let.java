package ast;
import java.util.ArrayList;

public class Let implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public ArrayList<Ast> lefts;
    public Ast right;
    public int ligne;

    public int colonne;

    @Override
    public int getLine() {
        return this.ligne;
    }

    @Override
    public int getColumn() {
        return this.colonne;
    }


    public Let(Ast right, int ligne, int colonne){
        this.lefts= new ArrayList<>();
        this.right=right;
        this.ligne=ligne;
        this.colonne=colonne;
    }

    public void add_Ast(Ast left){
        this.lefts.add(left);
    }
}
