grammar StringOp;

fragment SINGLE_SPACE   : '\u0020'; // ' '
fragment TABULATION     : '\u0009'; // '\t'
fragment LINE_FEED      : '\u000A'; // '\n'
fragment CARRAIGE_RETURN: '\u000D'; // '\r'

LICZBA_DODATNIA 	: [1-9][0-9]*;
CIAG				: '"' (ESC|.)*? '"' ;
ESC 				: '\\"' | '\\\\' ; 
KONKATENACJA        : '+';
ROZNICA      		: '-';
WYLUSKIWANIE        : '/';
KAPITALIZACJA		: '^+';
DEKAPITALIZACJA		: '^-';
PRZESUNIECIE_PRAWO  : '>';
PRZESUNIECIE_LEWO   : '<';

WhiteSpace    : ( SINGLE_SPACE | TABULATION )+ -> skip;
NewLine       : ( CARRAIGE_RETURN | LINE_FEED )+ -> skip;

wyrazenie		: op=(KONKATENACJA | ROZNICA) wyrazenie wyrazenie			
					#operacja						
				| op=(PRZESUNIECIE_PRAWO | PRZESUNIECIE_LEWO) wyrazenie LICZBA_DODATNIA	
					#przesun
				| op=(KAPITALIZACJA | DEKAPITALIZACJA) wyrazenie					
					#wielkosc
				| op=WYLUSKIWANIE wyrazenie
					 LICZBA_DODATNIA 
					 LICZBA_DODATNIA
					#wyjmij
				| CIAG
					#ciag
				;
				
				
prog			: wyrazenie? EOF;