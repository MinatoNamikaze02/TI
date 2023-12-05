package ast;

public class Typepredefined  implements Ast{

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

    public String type;
    public int ligne;

    public int colonne;

    public Typepredefined(String type, int ligne, int colonne){
        this.type = type;
        this.ligne = ligne;
        this.colonne = colonne;
    }
}

