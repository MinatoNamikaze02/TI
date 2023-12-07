parser grammar Parsertiger;

@header{
package parser;
}

options {tokenVocab = Lexertiger;}

// program declaration
program : (expr)
    ;

// calculation priority

expr0 : expr1 expr0Prime
      ;

expr0Prime : OR expr1 expr0Prime
           | // epsilon
           ;

expr1 : expr2 expr1Prime
      ;

expr1Prime : AND expr2 expr1Prime
           | // epsilon
           ;

expr2 : expr3 expr2Prime
      ;

expr2Prime : (EQUAL | DIFF | LESS | GREATER | LESSEQ | GREATEREQ | EQUALTO) expr3
           | // epsilon
           ;

expr3 : expr4 expr3Prime
      ;

expr3Prime : (PLUS | MINUS) expr4 expr3Prime
           | // epsilon
           ;

expr4 : expr5 expr4Prime
      ;

expr4Prime : (MUL | DIV) expr5 expr4Prime
           | // epsilon
           ;

// Expressions

expr5: idcall #Idcal
    | STRINGCONSTANT #Strin
    | INTEGERCONSTANT #In
    | NIL #Nil
    | exprnegation #Neg
    | typedeclaration #TypDec
    | PAOUV exprseq? PAFER #ExprSeq
    ;

expr :expr0 #ExprC
    |IF expr THEN expr rulelse #IfThen
    |WHILE expr DO expr #While
    |FOR ID DPTEG expr TO expr DO expr #For
    |BREAK #Break
    |LET declaration+ IN (exprseq)? END #Let
    |print #Prt
    |types #Typ
    ;

// Rule definitions

print: PRINT PAOUV expr PAFER ;

rulelse : ELSE expr #Else
    |       #Empty
    ;

declaration : typedeclaration #TypeDec
    |variabledeclaration    #VarDec
    |functiondeclaration    #FuncDec
    ;

// functions

function: PAOUV exprlist? PAFER  #functio
    ;

functiondeclaration : FCT ID PAOUV (typefields)? PAFER functiondeclarationbis
    ;

functiondeclarationbis : EGAL expr #equal
    | DPT typeid EGAL expr  #typeequal
    ;

// Expression sequence/List

exprnegation: NEG expr5
    ;

exprseq : expr exprseqbis
    ;

exprseqbis : POINTV exprseq #dotexpr
    |   #null1
    ;

exprlist : expr exprlistbis
    ;

exprlistbis: VIRG expr exprlistbis  #exprlisbis
    |   #null2
    ;

// fields

fieldlist : field fieldlistbis
    ;

field: ID EGAL expr
    ;

fieldlistbis: VIRG field fieldlistbis  #fieldlisbis
    |   #null3
    ;

// Id/Value

idcall: ID (lvaluebis|function)
    ;

lvaluebis :POINT ID lvaluebis #dotid
    |CAOUV expr CAFER lvaluebis #bracketexpr
    | #null4
    ;



// Types

types: typeid (CAOUV expr CAFER OF expr
    |CROUV fieldlist? CRFER)
    ;

typedeclaration : TYPE typeid EGAL type;

type : typeid #typetypeid
    |CROUV (typefields)? CRFER #typecro
    |ARROF typeid #arrof
    ;

typefields : typefield typefieldsbis
    ;

typefieldsbis: VIRG typefields #virgtypefield
    |   #null5
    ;

typefield : ID DPT typeid;

typepredefined: (INT|STR)
    ;

typeid : ID #typeidid
    |typepredefined #predefined
    ;

// Variables

variabledeclaration : VAR ID variabledeclarationbis
    ;

variabledeclarationbis: DPT typeid DPTEG expr  #vardec1
    | DPTEG expr #vardec2
    ;
