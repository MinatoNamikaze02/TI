grammar expr;

@header{
package parser;
}


program : (expr);

expr :expr0
    |lvalue ':=' expr
    |'if' expr 'then' expr
    |'if' expr 'then' expr 'else' expr
    |'while' expr 'do' expr
    |'for' ID ':=' expr 'to' expr 'do' expr
    |'break'
    |'let' declarationlist 'in' (exprseq)? 'end'
    |commentaire
    ;

expr0: expr1 '|' expr0 | expr1
    ;

expr1 : expr2 '&' expr1 | expr2
    ;

expr2: expr3 ('=' | '<>' | '>' | '<' | '>=' | '<=') expr2 | expr3
    ;

expr3: expr4 ('+'|'-') expr3 | expr4
    ;

expr4: expr5 ('*'|'/') expr4 | expr5
    ;

expr5: lvalue 
    | STRINGCONSTANT 
    | INTEGERCONSTANT 
    | 'nil' 
    | '-' expr5 
    | ID '(' exprlist? ')' 
    | typeid '[' expr ']' 'of' expr 
    | typeid '{' fieldlist? '}' 
    | '(' exprseq? ')'
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

typefield : ID ':' (typeid|typepredefined);

typepredefined: ('int'|'string')
    ;

typeid : ID|typepredefined;

variabledeclaration : 'var' ID ':=' expr
    | 'var' ID ':' typeid ':=' expr;


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
