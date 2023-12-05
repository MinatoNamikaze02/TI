package ast;

public class Idcall2 implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public String id;
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


    public Idcall2(String id, int ligne, int colonne){
        this.id=id;
        this.ligne=ligne;
        this.colonne=colonne;
    }
}