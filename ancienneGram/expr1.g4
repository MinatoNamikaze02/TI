grammar expr;

@header{
package parser;
}


program : (expr);

expr : STRINGCONSTANT
    |INTEGERCONSTANT
    |'nil'
    |lvalue
    |'-'expr
    |expr ('+'| '-' | '*' | '/' | '=' | '<>' | '>' | '<' | '>=' | '<=' | '&' | '|') expr
    |lvalue ':=' expr
    |ID '(' exprlist? ')'
    |'(' exprseq? ')'
    |typeid '{' fieldlist? '}'
    |typeid '[' expr ']' 'of' expr
    |'if' expr 'then' expr
    |'if' expr 'then' expr 'else' expr
    |'while' expr 'do' expr
    |'for' ID ':=' expr 'to' expr 'do' expr
    |'break'
    |'let' declarationlist 'in' (exprseq)? 'end'
    |commentaire
    ;

commentaire : '/*' (STRINGCONSTANT)* '*/' ;

exprseq : expr
    |expr ';' exprseq;

exprlist : expr
    |expr ',' exprlist;

fieldlist : ID '=' expr
    |ID '=' expr ',' fieldlist;

lvalue : ID
    |lvalue '.' ID
    |lvalue '[' expr ']'
    ;

declarationlist : declaration
    |declaration declarationlist;

declaration : typedeclaration
    |variabledeclaration
    |functiondeclaration;

typedeclaration : 'type' typeid '=' type;

type : typeid 
    |'{' (typefields)? '}'
    |'array of' typeid;

typefields : typefield
    |typefield ',' typefields;

typefield : ID ':' typeid;

typepredefined: ('int'|'string')
    ;

typeid : (ID|typepredefined);

variabledeclaration : 'var' ID ':=' expr
    | 'var' ID ':' typeid ':=' expr
    ;


functiondeclaration : 'function' ID ('(' typefields ')')? '=' expr
    |'function' ID ('(' typefields ')')? ':' typeid '=' expr
    ;

print: 'print' '(' INTEGERCONSTANT ')' ;

//token

INTEGERCONSTANT : ('0'..'9')+;
STRINGCONSTANT : ('"')('a'..'z'|'A'..'Z'|' '|'!'|'?'|'-'|'_'|'.'|':'|';'|',')*('"');
ID : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

BOPERATOR : ( '+'  | '-' | '*' | '/' | '=' | '<>' | '>' | '<' | '>=' | '<=' | '&' | '|');

WS : ('\n'|' '|'    ')+ ->skip;

