package ast;

public interface AstVisitor<T> {

    public T visit(Program affect);
	public T visit(Expr0 affect);
	public T visit(Expr1 affect);
	public T visit(Dif affect);
	public T visit(LessThan affect);
	public T visit(GreaterThan affect);
	public T visit(LessThanOrEq affect);
	public T visit(GreaterThanEq affect);
	public T visit(Plus affect);
	public T visit(Minus affect);
	public T visit(Mul affect);
	public T visit(Div affect);
	public T visit(Strin affect);
	public T visit(Const affect);
	public T visit(Nil affect);
	public T visit(IfThen affect);
	public T visit(While affect);
	public T visit(For affect);
	public T visit(Break affect);
	public T visit(Let affect);
	public T visit(Print affect);
	public T visit(Functiondeclaration affect);
	public T visit(FdecWithoutfields affect);
	public T visit(Equal affect);
	public T visit(Equal2 affect);
	public T visit(TypeEqual affect);
	public T visit(Exprnegation affect);
	public T visit(Exprseq affect);
	public T visit(Exprlist affect);
	public T visit(Fieldlist affect);
	public T visit(Field affect);
	public T visit(FuncCall affect);
	public T visit(Idcall2 affect);
	public T visit(Pointid affect);
	public T visit(Brack affect);
	public T visit(Typeswithof affect);
	public T visit(Typeswithfieldlist affect);
	public T visit(Typedeclaration affect);
	public T visit(Typefields affect);
	public T visit(Typefield affect);
	public T visit(Typepredefined affect);
	public T visit(Typeidid affect);
	public T visit(Variabledeclaration affect);
	public T visit(Vardec1 affect);
	public T visit(Assign affect);
	public T visit(Arrof affect);
	public T visit(AccessVar affect);

}
