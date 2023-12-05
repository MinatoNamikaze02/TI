package ast;

public class Typeidid  implements Ast{
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
    public int ligne;

    public int colonne;

    public Typeidid(String id, int ligne, int colonne){
        this.id = id;
        this.ligne = ligne;
        this.colonne = colonne;
    }
}

