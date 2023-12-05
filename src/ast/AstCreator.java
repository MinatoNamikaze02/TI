package ast;

import parser.ParsertigerBaseVisitor;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;

import parser.Parsertiger;

public class AstCreator extends ParsertigerBaseVisitor<Ast>{

    	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitProgram(Parsertiger.ProgramContext ctx) { 

		Ast expr = ctx.getChild(0).accept(this);

		return new Program(expr,ctx.start.getLine(),ctx.start.getCharPositionInLine());
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitExpr0(Parsertiger.Expr0Context ctx) { 
		
		Ast noeudTemporaire = ctx.getChild(0).accept(this);


        for (int i=0;2*i<ctx.getChildCount()-1;i++){
            
            
            Ast right = ctx.getChild(2*(i+1)).accept(this);

            
            noeudTemporaire = new Expr0(noeudTemporaire,right,ctx.start.getLine(),ctx.start.getCharPositionInLine());

            }

        return noeudTemporaire;

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitExpr1(Parsertiger.Expr1Context ctx) { 
		
		Ast noeudTemporaire = ctx.getChild(0).accept(this);


        for (int i=0;2*i<ctx.getChildCount()-1;i++){
            
            
            Ast right = ctx.getChild(2*(i+1)).accept(this);

            
            noeudTemporaire = new Expr1(noeudTemporaire,right,ctx.start.getLine(),ctx.start.getCharPositionInLine());

            }

        return noeudTemporaire;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitExpr2(Parsertiger.Expr2Context ctx) { 
		
		Ast noeudTemporaire = ctx.getChild(0).accept(this);


        for (int i=0;2*i<ctx.getChildCount()-1;i++){
            
            String operation = ctx.getChild(2*i+1).toString();
            Ast right = ctx.getChild(2*(i+1)).accept(this);

            switch (operation) {
                case "=":
                    noeudTemporaire = new Egal2(noeudTemporaire,right,ctx.start.getLine(),ctx.start.getCharPositionInLine());
                    break;
                case "<>":
                    noeudTemporaire = new Dif(noeudTemporaire,right,ctx.start.getLine(),ctx.start.getCharPositionInLine());
                    break;
				case "<":
                    noeudTemporaire = new Inf(noeudTemporaire,right,ctx.start.getLine(),ctx.start.getCharPositionInLine());
                    break;
				case ">":
                    noeudTemporaire = new Sup(noeudTemporaire,right,ctx.start.getLine(),ctx.start.getCharPositionInLine());
                    break;
				case "<=":
                    noeudTemporaire = new Infeg(noeudTemporaire,right,ctx.start.getLine(),ctx.start.getCharPositionInLine());
                    break;
				case ">=":
                    noeudTemporaire = new Supeg(noeudTemporaire,right,ctx.start.getLine(),ctx.start.getCharPositionInLine());
                    break;
				case ":=":
					noeudTemporaire = new Dptegal(noeudTemporaire, right, ctx.start.getLine(), ctx.start.getCharPositionInLine());
                default:
                    break;
            }
            }

        return noeudTemporaire;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitExpr3(Parsertiger.Expr3Context ctx) { 
		Ast noeudTemporaire = ctx.getChild(0).accept(this);


        for (int i=0;2*i<ctx.getChildCount()-1;i++){
            
            String operation = ctx.getChild(2*i+1).toString();
            Ast right = ctx.getChild(2*(i+1)).accept(this);

            switch (operation) {
                case "-":
                    noeudTemporaire = new Minus(noeudTemporaire,right,ctx.start.getLine(),ctx.start.getCharPositionInLine());
                    break;
                case "+":
                    noeudTemporaire = new Plus(noeudTemporaire,right,ctx.start.getLine(),ctx.start.getCharPositionInLine());
                    break;
                default:
                    break;
            }


        }    

        return noeudTemporaire;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitExpr4(Parsertiger.Expr4Context ctx) { 

		Ast noeudTemporaire = ctx.getChild(0).accept(this);


        for (int i=0;2*i<ctx.getChildCount()-1;i++){
            
            String operation = ctx.getChild(2*i+1).toString();
            Ast right = ctx.getChild(2*(i+1)).accept(this);

            switch (operation) {
                case "*":
                    noeudTemporaire = new Mul(noeudTemporaire,right,ctx.start.getLine(),ctx.start.getCharPositionInLine());
                    break;
                case "/":
                    noeudTemporaire = new Div(noeudTemporaire,right,ctx.start.getLine(),ctx.start.getCharPositionInLine());
                    break;
                default:
                    break;
            }


        }    

        return noeudTemporaire;

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitIdcal(Parsertiger.IdcalContext ctx) { return ctx.getChild(0).accept(this);
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitStrin(Parsertiger.StrinContext ctx) { 
	
		return new Strin(ctx.getChild(0).toString(),ctx.start.getLine(),ctx.start.getCharPositionInLine());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitIn(Parsertiger.InContext ctx) { 
		return new In(Integer.parseInt(ctx.getChild(0).toString()),ctx.start.getLine(),ctx.start.getCharPositionInLine());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitNil(Parsertiger.NilContext ctx) { 
		return new Nil(ctx.getChild(0).toString(),ctx.start.getLine(),ctx.start.getCharPositionInLine());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitNeg(Parsertiger.NegContext ctx) { 
		return ctx.getChild(0).accept(this);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitTypDec(Parsertiger.TypDecContext ctx) { return ctx.getChild(0).accept(this);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitExprSeq(Parsertiger.ExprSeqContext ctx) { 
		int nbrfils =ctx.getChildCount();
		if(nbrfils==3){
			return ctx.getChild(1).accept(this);
		}
		else{
			return null;
		}	
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitExprC(Parsertiger.ExprCContext ctx) { 
		return ctx.getChild(0).accept(this);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitIfThen(Parsertiger.IfThenContext ctx) { 
		Ast left= ctx.getChild(1).accept(this);
		Ast center= ctx.getChild(3).accept(this);
		Ast right= ctx.getChild(4).accept(this);
		return new IfThen(left, center, right,ctx.start.getLine(),ctx.start.getCharPositionInLine());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitWhile(Parsertiger.WhileContext ctx) { 
		Ast left= ctx.getChild(1).accept(this);
		Ast right= ctx.getChild(3).accept(this);
		return new While(left, right,ctx.start.getLine(),ctx.start.getCharPositionInLine());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitFor(Parsertiger.ForContext ctx) { 
		String id = ctx.getChild(1).getText();
		Ast min =ctx.getChild(3).accept(this);
		Ast max= ctx.getChild(5).accept(this);
		Ast regle =ctx.getChild(7).accept(this);
		return new For(id, min, max, regle,ctx.start.getLine(),ctx.start.getCharPositionInLine());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitBreak(Parsertiger.BreakContext ctx) { 
		
		return new Break(ctx.getChild(0).getText(),ctx.start.getLine(),ctx.start.getCharPositionInLine());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitLet(Parsertiger.LetContext ctx) { 
		Ast var=null;
		int valeurin=0;
		for (int i=0;i<ctx.getChildCount();i++){
			if(ctx.getChild(i).getText().equals("in")){
				valeurin=i;
			}
		}

		if(ctx.getChildCount()-1-valeurin==2){
			var= ctx.getChild(valeurin+1).accept(this);

		}
		Let lefts = new Let(var,ctx.start.getLine(),ctx.start.getCharPositionInLine());
		for(int i=0;i<valeurin;i++){
			lefts.add_Ast(ctx.getChild(i).accept(this));
		}
		return lefts;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitPrt(Parsertiger.PrtContext ctx) { 
		return ctx.getChild(0).accept(this);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitTyp(Parsertiger.TypContext ctx) { 
		return ctx.getChild(0).accept(this);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitPrint(Parsertiger.PrintContext ctx) {

		Ast fils = ctx.getChild(2).accept(this);
		return new Print(fils,ctx.start.getLine(),ctx.start.getCharPositionInLine());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitElse(Parsertiger.ElseContext ctx) { 
		return ctx.getChild(1).accept(this);
	}
	
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitTypeDec(Parsertiger.TypeDecContext ctx) { 
		return ctx.getChild(0).accept(this);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitVarDec(Parsertiger.VarDecContext ctx) { 
		return ctx.getChild(0).accept(this);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitFuncDec(Parsertiger.FuncDecContext ctx) { 
		return ctx.getChild(0).accept(this);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitFunctio(Parsertiger.FunctioContext ctx) {
		int cmp= ctx.getChildCount();
		if(cmp==3){
			return ctx.getChild(1).accept(this);
		}else return null;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitFunctiondeclaration(Parsertiger.FunctiondeclarationContext ctx) { 
		String id = ctx.getChild(1).getText();
		int cmp = ctx.getChildCount();
		if(cmp==6){
			Ast typefields = ctx.getChild(3).accept(this);
			Ast functiondeclaration = ctx.getChild(5).accept(this);
			return new Functiondeclaration(id, typefields, functiondeclaration,ctx.start.getLine(),ctx.start.getCharPositionInLine());
		}
		else{
			Ast functiondeclaration = ctx.getChild(4).accept(this);
			return new FdecWithoutfields(id, functiondeclaration,ctx.start.getLine(),ctx.start.getCharPositionInLine());
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitEgal(Parsertiger.EgalContext ctx) { 
		String eg = ctx.getChild(0).getText();
		Ast expr = ctx.getChild(1).accept(this);
		return new Egal(eg, expr,ctx.start.getLine(),ctx.start.getCharPositionInLine());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitTypegal(Parsertiger.TypegalContext ctx) {
		Ast typeid = ctx.getChild(1).accept(this);
		String eg = ctx.getChild(2).getText();
		Ast expr = ctx.getChild(3).accept(this);
		return new Typegal(typeid, eg, expr,ctx.start.getLine(),ctx.start.getCharPositionInLine());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitExprnegation(Parsertiger.ExprnegationContext ctx) { 
		String neg = ctx.getChild(0).getText();
		Ast expr = ctx.getChild(1).accept(this);
		return new Exprnegation(neg, expr,	ctx.start.getLine(),ctx.start.getCharPositionInLine());
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitExprseq(Parsertiger.ExprsContext ctx) {
		ArrayList<Ast> list = new ArrayList<Ast>();
		ParseTree expr = ctx;
		while (true){
			list.add(expr.getChild(0).accept(this));
			if (expr.getChild(1).getChild(0)==null){
				break;
			}
			expr = expr.getChild(1).getChild(1);
		}
		return new Exprseq(list,ctx.start.getLine(),ctx.start.getCharPositionInLine());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitPointexpr(Parsertiger.PointexprContext ctx) { 
		return ctx.getChild(1).accept(this);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitExprlist(Parsertiger.ExprlistContext ctx) { 
		ArrayList<Ast> list = new ArrayList<Ast>();
		ParseTree expr = ctx;
		list.add(expr.getChild(0).accept(this));
		if (expr.getChild(1).getChild(0)==null){
			return new Exprlist(list,ctx.start.getLine(),ctx.start.getCharPositionInLine());
		}
		expr = expr.getChild(1);
		while (true){
			list.add(expr.getChild(1).accept(this));
			if (expr.getChild(2).getChild(0)==null){
				break;
			}
			expr = expr.getChild(2);
			
		}
		return new Exprlist(list,ctx.start.getLine(),ctx.start.getCharPositionInLine());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitFieldlist(Parsertiger.FieldlistContext ctx) { 
		ArrayList<Ast> list = new ArrayList<Ast>();
		ParseTree field = ctx;
		list.add(field.getChild(0).accept(this));
		if (field.getChild(1).getChild(0)==null){
			return new Fieldlist(list,ctx.start.getLine(),ctx.start.getCharPositionInLine());
		}
		field = field.getChild(1);
		while (true){
			list.add(field.getChild(1).accept(this));
			if (field.getChild(2).getChild(0)==null){
				break;
			}
			field = field.getChild(2);
			
		}
		return new Fieldlist(list,ctx.start.getLine(),ctx.start.getCharPositionInLine());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitField(Parsertiger.FieldContext ctx) { 
		String id = ctx.getChild(0).getText();
		Ast expr = ctx.getChild(2).accept(this);
		return new Field(expr, id,ctx.start.getLine(),ctx.start.getCharPositionInLine());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitIdcall(Parsertiger.IdcallContext ctx) {
		String id= ctx.getChild(0).getText();
		ParseTree fils = ctx.getChild(1);
		ArrayList<String> list = new ArrayList<String>();
		while (fils.getChild(0)!=null){
			if (fils.getChild(0).getText().charAt(0)=='.'){
				list.add("."+fils.getChild(1).getText());
				fils = fils.getChild(2);
			}
			else if (fils.getChild(0).getText().charAt(0)=='('){
				list.add("("+fils.getChild(1).getText()+")");
				break;
			}
			else if (fils.getChild(0).getText().charAt(0)=='['){
				list.add("["+fils.getChild(1).getText()+"]");
				fils = fils.getChild(3);
			}
			else {
				list.add(fils.getText());
				break;
			}
		}
		if (list.size()>0){
			return recursiveAppel(list, id, ctx.getChild(1), list.size(),ctx);
		}
		else {
			return new Idcall2(id,ctx.start.getLine(),ctx.start.getCharPositionInLine());
		}
	}

	public Ast recursiveAppel(ArrayList<String> list, String id, ParseTree ctx ,int taillelist,Parsertiger.IdcallContext ctx2){

		if (list.size()==1){
			if (list.get(0).charAt(0)=='('){
				return new Appelfunc(id,ctx.getChild(1).accept(this),ctx2.start.getLine(),ctx2.start.getCharPositionInLine());
			}
			else if (list.get(0).charAt(0)=='['){
				return new AccesVar(id, ctx.getChild(1).accept(this),ctx2.start.getLine(),ctx2.start.getCharPositionInLine());
			}
			else if (list.get(0).charAt(0)=='.'){
				return new Pointid(id, ctx.getChild(1).getText(),ctx2.start.getLine(),ctx2.start.getCharPositionInLine());
			}
			else {
				System.out.println("erreur");
				return new Idcall2(id,ctx2.start.getLine(),ctx2.start.getCharPositionInLine());
			}
		}
		else {
				
				ParseTree temp = ctx;
				for (int i=0; i<list.size()-1; i++){
					if (list.get(i).charAt(0)=='.'){
						temp = temp.getChild(2);
					}
					else {
						temp = temp.getChild(3);
					}
				}
				String actuel = list.remove(list.size()-1);
			if (actuel.charAt(0)=='['){
				return new AccesVar(recursiveAppel(list, id, ctx,taillelist,ctx2),temp.getChild(1).accept(this),ctx2.start.getLine(),ctx2.start.getCharPositionInLine());
			}
			else{
				
				return new Pointid(recursiveAppel(list, id, ctx,taillelist,ctx2),temp.getChild(1).getText(),ctx2.start.getLine(),ctx2.start.getCharPositionInLine());
			}
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitPointid(Parsertiger.PointidContext ctx) { 
		String id = ctx.getChild(1).getText();
		return new Pointid(id, id,ctx.start.getLine(),ctx.start.getCharPositionInLine());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */ 
	@Override public Ast visitCroexpr(Parsertiger.CroexprContext ctx) { 	
		if (ctx.getChild(3).getChild(0)!=null){
			Ast expr= ctx.getChild(1).accept(this);
			Ast lvaluebis = ctx.getChild(3).accept(this);
			return new Croexpr(expr, lvaluebis,ctx.start.getLine(),ctx.start.getCharPositionInLine());
		}
		else {
			return ctx.getChild(1).accept(this);}
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitTypes(Parsertiger.TypesContext ctx) { 
		int cmp = ctx.getChildCount();
		Ast typeid = ctx.getChild(0).accept(this);
		if(cmp==6){
			Ast expr1 = ctx.getChild(2).accept(this);
			String of = ctx.getChild(4).getText();
			Ast expr2 = ctx.getChild(5).accept(this);
			return new Typeswithof(of,typeid, expr1, expr2,ctx.start.getLine(),ctx.start.getCharPositionInLine());
		}else if (cmp==4){
			Ast fieldlist = ctx.getChild(2).accept(this);
			return new Typeswithfieldlist(typeid, fieldlist,ctx.start.getLine(),ctx.start.getCharPositionInLine());
		}else{
			return typeid;
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitTypedeclaration(Parsertiger.TypedeclarationContext ctx) { 
		Ast typeid = ctx.getChild(1).accept(this);
		Ast type = ctx.getChild(3).accept(this);
		return new Typedeclaration(typeid, type,ctx.start.getLine(),ctx.start.getCharPositionInLine());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitTypetypeid(Parsertiger.TypetypeidContext ctx) { 
		return ctx.getChild(0).accept(this);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitTypecro(Parsertiger.TypecroContext ctx) { 
		int cmp= ctx.getChildCount();
		if(cmp==3){
			return ctx.getChild(1).accept(this);
		}
		else{
			return null;
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitArrof(Parsertiger.ArrofContext ctx) { 
		Ast type = ctx.getChild(1).accept(this);
		return new Arrof(type,ctx.start.getLine(),ctx.start.getCharPositionInLine());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitTypefields(Parsertiger.TypefieldsContext ctx) { 
		ArrayList<Ast> list = new ArrayList<Ast>();
		ParseTree field = ctx;
		while (true){
			list.add(field.getChild(0).accept(this));
			if (field.getChild(1).getChild(0)==null){
				break;
			}
			field = field.getChild(1).getChild(1);
		}
		return new Typefields(list,ctx.start.getLine(),ctx.start.getCharPositionInLine());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitVirgtypefield(Parsertiger.VirgtypefieldContext ctx) {
		return ctx.getChild(1).accept(this);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitTypefield(Parsertiger.TypefieldContext ctx) { 
		String id =  ctx.getChild(0).toString();
		Ast typeid = ctx.getChild(2).accept(this);
		return new Typefield(id, typeid,ctx.start.getLine(),ctx.start.getCharPositionInLine());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitTypepredefined(Parsertiger.TypepredefinedContext ctx) { 
		String type =  ctx.getChild(0).toString();
		return new Typepredefined(type,ctx.start.getLine(),ctx.start.getCharPositionInLine());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitTypeidid(Parsertiger.TypeididContext ctx) { 
		String id =  ctx.getChild(0).toString();
		return new Typeidid(id,ctx.start.getLine(),ctx.start.getCharPositionInLine());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitPredefined(Parsertiger.PredefinedContext ctx) { 
		return ctx.getChild(0).accept(this);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitVariabledeclaration(Parsertiger.VariabledeclarationContext ctx) { 
		String id = ctx.getChild(1).toString();
		Ast bis = ctx.getChild(2).accept(this);
		return new Variabledeclaration(id,bis,ctx.start.getLine(),ctx.start.getCharPositionInLine());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitVardec1(Parsertiger.Vardec1Context ctx) { 
		Ast typeid = ctx.getChild(1).accept(this);
		Ast expr = ctx.getChild(3).accept(this);
		return new Vardec1(typeid, expr,ctx.start.getLine(),ctx.start.getCharPositionInLine());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Ast visitVardec2(Parsertiger.Vardec2Context ctx) { 
		return ctx.getChild(1).accept(this);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
}
