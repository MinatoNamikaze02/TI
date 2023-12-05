package ast;

public class Typedeclaration implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    @Override
    public int getLine() {
        return this.ligne;
    }

    @Override
    public int getColumn() {
        return this.colonne;
    }


    public Ast type;
    public Ast typeid;
    public int ligne;

    public int colonne;

    public Typedeclaration (Ast typeid, Ast type, int ligne, int colonne){
        this.typeid = typeid;
        this.type = type;
        this.ligne = ligne;
        this.colonne = colonne;
    }
}

