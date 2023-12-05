package ast;

public class Program implements Ast{

    // Utile pour la dernière partie
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


    public Ast expression;
    public int ligne;
    public int colonne;

    public Program(Ast expression, int ligne, int colonne){
        this.expression=expression;
        this.ligne=ligne;
        this.colonne=colonne;
    }

}
