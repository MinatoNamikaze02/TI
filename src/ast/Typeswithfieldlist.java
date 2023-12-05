package ast;

public class Typeswithfieldlist implements Ast{

    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }

    public Ast typeid;
    public Ast fieldlist;
    public int ligne;

    public int colonne;

    public Typeswithfieldlist(Ast typeid, Ast fieldlist, int ligne, int colonne){
        this.typeid = typeid;
        this.fieldlist = fieldlist;
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
