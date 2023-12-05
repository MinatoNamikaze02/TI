// Generated from Parsertiger.g4 by ANTLR 4.9.2

package parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Parsertiger}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParsertigerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Parsertiger#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Parsertiger.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsertiger#expr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr0(Parsertiger.Expr0Context ctx);
	/**
	 * Visit a parse tree produced by {@link Parsertiger#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1(Parsertiger.Expr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Parsertiger#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2(Parsertiger.Expr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Parsertiger#expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr3(Parsertiger.Expr3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Parsertiger#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr4(Parsertiger.Expr4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Idcal}
	 * labeled alternative in {@link Parsertiger#expr5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdcal(Parsertiger.IdcalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Strin}
	 * labeled alternative in {@link Parsertiger#expr5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrin(Parsertiger.StrinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code In}
	 * labeled alternative in {@link Parsertiger#expr5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn(Parsertiger.InContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Nil}
	 * labeled alternative in {@link Parsertiger#expr5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil(Parsertiger.NilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Neg}
	 * labeled alternative in {@link Parsertiger#expr5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg(Parsertiger.NegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypDec}
	 * labeled alternative in {@link Parsertiger#expr5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypDec(Parsertiger.TypDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSeq}
	 * labeled alternative in {@link Parsertiger#expr5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSeq(Parsertiger.ExprSeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprC}
	 * labeled alternative in {@link Parsertiger#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprC(Parsertiger.ExprCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfThen}
	 * labeled alternative in {@link Parsertiger#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThen(Parsertiger.IfThenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link Parsertiger#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(Parsertiger.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code For}
	 * labeled alternative in {@link Parsertiger#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(Parsertiger.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link Parsertiger#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(Parsertiger.BreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Let}
	 * labeled alternative in {@link Parsertiger#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(Parsertiger.LetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Prt}
	 * labeled alternative in {@link Parsertiger#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrt(Parsertiger.PrtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Typ}
	 * labeled alternative in {@link Parsertiger#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyp(Parsertiger.TypContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsertiger#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(Parsertiger.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Else}
	 * labeled alternative in {@link Parsertiger#rulelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(Parsertiger.ElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Vide}
	 * labeled alternative in {@link Parsertiger#rulelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVide(Parsertiger.VideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeDec}
	 * labeled alternative in {@link Parsertiger#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDec(Parsertiger.TypeDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDec}
	 * labeled alternative in {@link Parsertiger#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(Parsertiger.VarDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncDec}
	 * labeled alternative in {@link Parsertiger#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDec(Parsertiger.FuncDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functio}
	 * labeled alternative in {@link Parsertiger#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctio(Parsertiger.FunctioContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsertiger#functiondeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondeclaration(Parsertiger.FunctiondeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code egal}
	 * labeled alternative in {@link Parsertiger#functiondeclarationbis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEgal(Parsertiger.EgalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typegal}
	 * labeled alternative in {@link Parsertiger#functiondeclarationbis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypegal(Parsertiger.TypegalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsertiger#exprnegation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprnegation(Parsertiger.ExprnegationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsertiger#exprseq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprseq(Parsertiger.ExprsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pointexpr}
	 * labeled alternative in {@link Parsertiger#exprseqbis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointexpr(Parsertiger.PointexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nul1}
	 * labeled alternative in {@link Parsertiger#exprseqbis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNul1(Parsertiger.Nul1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Parsertiger#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(Parsertiger.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprlisbis}
	 * labeled alternative in {@link Parsertiger#exprlistbis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlisbis(Parsertiger.ExprlisbisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nul2}
	 * labeled alternative in {@link Parsertiger#exprlistbis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNul2(Parsertiger.Nul2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Parsertiger#fieldlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldlist(Parsertiger.FieldlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsertiger#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(Parsertiger.FieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldlisbis}
	 * labeled alternative in {@link Parsertiger#fieldlistbis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldlisbis(Parsertiger.FieldlisbisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nul3}
	 * labeled alternative in {@link Parsertiger#fieldlistbis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNul3(Parsertiger.Nul3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Parsertiger#idcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdcall(Parsertiger.IdcallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pointid}
	 * labeled alternative in {@link Parsertiger#lvaluebis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointid(Parsertiger.PointidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code croexpr}
	 * labeled alternative in {@link Parsertiger#lvaluebis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCroexpr(Parsertiger.CroexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nul4}
	 * labeled alternative in {@link Parsertiger#lvaluebis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNul4(Parsertiger.Nul4Context ctx);
	/**
	 * Visit a parse tree produced by {@link Parsertiger#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(Parsertiger.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsertiger#typedeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedeclaration(Parsertiger.TypedeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typetypeid}
	 * labeled alternative in {@link Parsertiger#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypetypeid(Parsertiger.TypetypeidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typecro}
	 * labeled alternative in {@link Parsertiger#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypecro(Parsertiger.TypecroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrof}
	 * labeled alternative in {@link Parsertiger#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrof(Parsertiger.ArrofContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsertiger#typefields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypefields(Parsertiger.TypefieldsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code virgtypefield}
	 * labeled alternative in {@link Parsertiger#typefieldsbis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirgtypefield(Parsertiger.VirgtypefieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nul5}
	 * labeled alternative in {@link Parsertiger#typefieldsbis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNul5(Parsertiger.Nul5Context ctx);
	/**
	 * Visit a parse tree produced by {@link Parsertiger#typefield}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypefield(Parsertiger.TypefieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsertiger#typepredefined}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypepredefined(Parsertiger.TypepredefinedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeidid}
	 * labeled alternative in {@link Parsertiger#typeid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeidid(Parsertiger.TypeididContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predefined}
	 * labeled alternative in {@link Parsertiger#typeid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredefined(Parsertiger.PredefinedContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsertiger#variabledeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariabledeclaration(Parsertiger.VariabledeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vardec1}
	 * labeled alternative in {@link Parsertiger#variabledeclarationbis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardec1(Parsertiger.Vardec1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code vardec2}
	 * labeled alternative in {@link Parsertiger#variabledeclarationbis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardec2(Parsertiger.Vardec2Context ctx);
}