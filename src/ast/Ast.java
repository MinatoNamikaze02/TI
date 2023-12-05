package ast;

public interface Ast {

    public int getLine();

    public int getColumn();

    public <T> T accept(AstVisitor<T> visitor);

    public String toString();
    
}