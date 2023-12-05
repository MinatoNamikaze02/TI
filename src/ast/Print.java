package ast;

public class Print implements Ast {
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

    public Ast fils;
    public int ligne;

    public int colonne;

    public Print( Ast fils, int ligne, int colonne){
        this.fils=fils;
        this.ligne=ligne;
        this.colonne=colonne;
    }
}
