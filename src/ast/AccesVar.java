package ast;

public class AccesVar implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public int ligne;

    public int colonne;
    public Ast right;
    public String id;
    public Ast left;

    public AccesVar(String id,Ast right,int ligne,int colonne){
        this.id=id;
        this.right= right;
        this.left=null;
        this.ligne = ligne;
        this.colonne =colonne;
    }

    public AccesVar(Ast left, Ast right, int ligne, int colonne){
        this.left=left;
        this.right=right;
        this.id=null;
        this.ligne = ligne;
        this.colonne = colonne;
    }

    public int getLine(){
        return this.ligne;
    }

    public int getColumn(){
        return this.colonne;
    }
}
