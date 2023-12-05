package ast;

public class Strin  implements Ast{
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

    public String strin;
    public int ligne;

    public int colonne;

    public Strin(String strin, int ligne, int colonne){
        this.strin=strin.replace(String.valueOf('"'),String.valueOf("\\"+'"'));
        this.ligne=ligne;
        this.colonne=colonne;
    }
}
