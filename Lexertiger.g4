lexer grammar Lexertiger;

@header{
package lexer;
}

//Ponctuation

POINT: '.'
    ;

POINTV: ';'
    ;

VIRG: ','
    ;

DPT: ':'
    ;

//Ouvertures

PAOUV: '('
    ;

PAFER: ')'
    ;

CROUV: '{'
    ;

CRFER: '}'
    ;

CAOUV: '['
    ;

CAFER: ']'
    ;


// Signe

DIF: '<>'
    ;

EGAL: '='
    ;

DPTEG: ':='
    ;

INFEG: '>='
    ;

INF: '>'
    ;

SUP: '<'
    ;

SUPEG: '<='
    ;

// Operators

PLUS: '+'
    ;

NEG: '-'
    ;

OU: '|'
    ;

ET: '&'
    ;

MUL: '*'
    ;

DIV: '/'
    ;

// mot Clés

NIL: 'nil'
    ;

BREAK: 'break'
    ;

FOR: 'for'
    ;

THEN: 'then'
    ;

END: 'end'
    ;

IN: 'in'
    ;

LET: 'let'
    ;

VAR: 'var'
    ;

IF: 'if'
    ;

ELSE: 'else'
    ;

OF: 'of'
    ;

ARROF: 'array of'
    ;

WHILE: 'while'
    ;

PRINT: 'print'
    ;

DO: 'do'
    ;

TO: 'to'
    ;

TYPE: 'type'
    ;

FCT: 'function'
    ;

//Types 

INT: 'int'
    ;

STR: 'string'
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