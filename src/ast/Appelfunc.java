package ast;

public class Appelfunc implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public int getLine(){
        return this.ligne;
    }

    public int getColumn(){
        return this.colonne;
    }

    public int ligne;

    public int colonne;
    public Ast right;
    public String id;
    public Ast left;

    public Appelfunc(String id,Ast right, int ligne, int colonne){
        this.id=id;
        this.right= right;
        this.left=null;
        this.ligne=ligne;
        this.colonne=colonne;

    }

    public Appelfunc(Ast left, Ast right){
        this.left=left;
        this.right=right;
        this.id=null;
    }
}
