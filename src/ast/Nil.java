package ast;

public class Nil implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }


    public String ni;
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

    public Nil(String ni, int ligne, int colonne) {
        this.ni=ni;
        this.ligne=ligne;
        this.colonne=colonne;
    }

}
