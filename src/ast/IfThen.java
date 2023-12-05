package ast;

public class IfThen implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast left;
    public Ast center;
    public Ast right;
    public int ligne;

    public int colonne;
    
    public IfThen(Ast left, Ast center, Ast right, int ligne, int colonne){
        this.left=left;
        this.center=center;
        this.right = right;
        this.ligne = ligne;
        this.colonne = colonne;
    }
    @Override
    public int getLine() {
        return this.ligne;
    }

    @Override
    public int getColumn() {
        return this.colonne;
    }

}
