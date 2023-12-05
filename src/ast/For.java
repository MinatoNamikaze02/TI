package ast;

public class For implements Ast {
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public String id;
    public Ast min;
    public Ast max;
    public Ast regle;
    public int ligne;

    public int colonne;

    public For(String id, Ast min, Ast max, Ast regle, int ligne, int colonne){
        this.id=id;
        this.min=min;
        this.max=max;
        this.regle=regle;
        this.ligne=ligne;
        this.colonne=colonne;
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
