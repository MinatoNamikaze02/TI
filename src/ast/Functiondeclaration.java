package ast;

public class Functiondeclaration implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    
   public String id;
   public Ast typefields;
   public Ast functiondeclaration;
   public int ligne;

   public int colonne;

    public Functiondeclaration(String id, Ast typefields, Ast functiondeclaration, int ligne, int colonne){
        this.id = id;
        this.typefields = typefields;
        this.functiondeclaration = functiondeclaration;
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
