package ast;

public class Typefield implements Ast{
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

    
    public String id;
    public Ast type;
    public int ligne;

    public int colonne;

    public Typefield(String id, Ast type, int ligne, int colonne){
        this.id = id;
        this.type = type;
        this.ligne = ligne;
        this.colonne = colonne;
    }
}

