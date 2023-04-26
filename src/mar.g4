grammar mar;

prog: (variableDeclaration)* (instruction)+ ;

variableDeclaration: dataType variableName ';' ;
dataType: 'number' | 'bool' | 'string' | 'nil' ;
variableName: LETTER (LETTER | DIGIT | '_')* ;
LETTER: [a-zA-Z] ;
DIGIT: [0-9] ;

instruction: printExp | block | whileStatement | ifStatement ;

printExp: 'print' exp ';' ;

block: '{' (instruction)+ '}' ;

whileStatement: 'while' exp 'do' instruction ;

ifStatement: 'if' exp 'then' instruction ('else' instruction)?;

exp : LPA exp RPA #PARE
| UNAR=(MINUS | NOT) exp  #UNAR
| exp OPERADOR=(DIV | MULT) exp    #DIVMULT
| exp MINUS exp  #MINUS
| exp ADD exp     #ADD
| exp RELACIONAL=(MAIOR | MAIORIG | MENOR | MENORIG) exp #REL
| exp COMP=(IGUAL | DIFERENTE) exp #COMP
| exp AND exp #AND
| exp OR exp #OR
| STRING #STRING
| number #NUM
| BOOL #BOOL
| NIL #NIL
;

number : INT | FLOAT ;
BOOL: 'true' | 'false' ;
NIL: 'nil' ;
STRING: '"' (~'"' | '\\"')* '"' ;

LPA: '(' ;
RPA: ')' ;
DIV: '/' ;
MINUS: '-' ;
MULT: '*' ;
ADD : '+' ;
INT : [0-9]+ ;
FLOAT: [0-9]+'.'[0-9]+ ;
MAIOR: '>' ;
MAIORIG: '>=' ;
MENOR: '<' ;
MENORIG: '<=' ;
IGUAL: '==' ;
DIFERENTE: '!=' ;
AND: 'and' ;
OR: 'or' ;
NOT: 'not' ;
WS : [ \t\n\r]+ -> skip;