grammar expr;

@header{
package parser;
}

// déclaration du programme
program : (expr)
    ;

//prioriré de calcul

expr0: expr1 ('|' expr1 )*
    ;

expr1 : expr2  ('&' expr2 )*
    ;


expr2: expr3  (('=' | '<>' | '>' | '<' | '>=' | '<=') expr3 )*
    ;


expr3: expr4 (('+'|'-') expr4 )*
    ;


expr4: expr5 (('*'|'/') expr5)*
    ;

//Expressions

expr5: idcall
    | STRINGCONSTANT 
    | INTEGERCONSTANT 
    | 'nil' 
    | exprnegation
    | typedeclaration
    | '(' exprseq? ')'
    ;

expr :expr0 
    |'if' expr 'then' expr rulelse
    |'while' expr 'do' expr
    |'for' ID ':=' expr 'to' expr 'do' expr
    |'break'
    |'let' declaration+ 'in' (exprseq)? 'end'
    |print
    |types
    ;

//Définitions règles

print: 'print' '(' expr ')' ;

rulelse : 'else' expr 
    |
    ;

declaration : typedeclaration
    |variabledeclaration
    |functiondeclaration
    ;

//fonctions

function:'(' exprlist? ')' ;

functiondeclaration : 'function' ID '(' (typefields)? ')' functiondeclarationbis
    ;

functiondeclarationbis : '=' expr 
    | ':' typeid '=' expr
    ; 

// Expressions sequence/Liste

exprnegation: '-' expr5
    ;

exprseq : expr exprseqbis
    ;

exprseqbis : ';' exprseq 
    |
    ;

exprlist : expr exprlistbis
    ;

exprlistbis: ',' expr exprlistbis 
    |
    ;

//fields    

fieldlist : field fieldlistbis
    ;

field: ID '=' expr
    ;

fieldlistbis: ',' field fieldlistbis 
    |
    ;

//Id/Value

idcall: ID (lvaluebis|function)
    ;

lvaluebis :'.' ID lvaluebis
    |'[' expr ']' lvaluebis
    |
    ;



//Types    

types: typeid ('[' expr ']' 'of' expr 
    |'{' fieldlist? '}')
    ;

typedeclaration : 'type' typeid '=' type;

type : typeid 
    |'{' (typefields)? '}'
    |'array of' typeid
    ;

typefields : typefield typefieldsbis
    ;

typefieldsbis: ',' typefields 
    |
    ;

typefield : ID ':' typeid;

typepredefined: ('int'|'string')
    ;

typeid : ID
    |typepredefined
    ;

//Variables

variabledeclaration : 'var' ID variabledeclarationbis
    ;

variabledeclarationbis: ':'typeid ':=' expr 
    | ':=' expr
    ;


//token

INTEGERCONSTANT : ('0'..'9')+
    ;
STRINGCONSTANT : ('"')('a'..'z'|'A'..'Z'|' '|'!'|'?'|'-'|'_'|'.'|':'|';'|',')*('"')
    ;
ID : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

BOPERATOR : ( '+'  | '-' | '*' | '/' | '=' | '<>' | '>' | '<' | '>=' | '<=' | '&' | '|')
    ;

WS : ('\n'|' '|'    '|'\t')+ ->skip
    ;
COMMENT:    '/*' .*? '*/' -> skip
    ;
