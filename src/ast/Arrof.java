package ast;

public class Arrof  implements Ast{
    public <T> T accept(AstVisitor<T> visitor){
        return visitor.visit(this);
    }
    public int getLine(){
        return this.line;
    }

    public int getColumn(){
        return this.column;
    }

    public Arrof(Ast type, int line, int column) {
        this.type = type;
        this.line = line;
        this.column = column;
    }
        
    public Ast type;
    public int line;

    public int column;
    
        
}
    

