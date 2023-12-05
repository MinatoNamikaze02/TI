parser grammar Parsertiger;

@header{
package parser;
}

options {tokenVocab = Lexertiger;}

// déclaration du programme
program : (expr)
    ;

//prioriré de calcul

expr0: expr1 (OU expr1 )*
    ;

expr1 : expr2  (ET expr2 )*
    ;


expr2: expr3  ((EGAL | DIF | INF | SUP | INFEG | SUPEG | DPTEG) expr3 )?
    ;


expr3: expr4 ((PLUS|NEG) expr4 )*
    ;


expr4: expr5 ((MUL|DIV) expr5)*
    ;

//Expressions

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

//Définitions règles

print: PRINT PAOUV expr PAFER ;

rulelse : ELSE expr #Else
    |       #Vide
    ;

declaration : typedeclaration #TypeDec
    |variabledeclaration    #VarDec
    |functiondeclaration    #FuncDec
    ;

//fonctions

function: PAOUV exprlist? PAFER  #functio
    ;

functiondeclaration : FCT ID PAOUV (typefields)? PAFER functiondeclarationbis
    ;

functiondeclarationbis : EGAL expr #egal
    | DPT typeid EGAL expr  #typegal
    ; 

// Expressions sequence/Liste

exprnegation: NEG expr5 
    ;

exprseq : expr exprseqbis
    ;

exprseqbis : POINTV exprseq #pointexpr
    |   #nul1
    ;

exprlist : expr exprlistbis
    ;

exprlistbis: VIRG expr exprlistbis  #exprlisbis
    |   #nul2
    ;

//fields    

fieldlist : field fieldlistbis
    ;

field: ID EGAL expr
    ;

fieldlistbis: VIRG field fieldlistbis  #fieldlisbis
    |   #nul3
    ;

//Id/Value

idcall: ID (lvaluebis|function)
    ;

lvaluebis :POINT ID lvaluebis #pointid
    |CAOUV expr CAFER lvaluebis #croexpr
    | #nul4
    ;



//Types    

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
    |   #nul5
    ;

typefield : ID DPT typeid;

typepredefined: (INT|STR)
    ;

typeid : ID #typeidid
    |typepredefined #predefined
    ;

//Variables

variabledeclaration : VAR ID variabledeclarationbis
    ;

variabledeclarationbis: DPT typeid DPTEG expr  #vardec1
    | DPTEG expr #vardec2
    ;



