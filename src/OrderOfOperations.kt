/*
1	()   []   ->   .   ::	Function call, scope, array/member access
2	!   ~   -   +   *   &   sizeof   type cast   ++   --  	(most) unary operators, sizeof and type casts (right to left)
3	*   /   % MOD	Multiplication, division, modulo
4	+   -	Addition and subtraction
5	<<   >>	Bitwise shift left and right
6	<   <=   >   >=	Comparisons: less-than and greater-than
7	==   !=	Comparisons: equal and not equal
8	&	Bitwise AND
9	^	Bitwise exclusive OR (XOR)
10	|	Bitwise inclusive (normal) OR
11	&&	Logical AND
12	||	Logical OR
13	? :	Conditional expression (ternary)
14	=   +=   -=   *=   /=   %=   &=   |=   ^=   <<=   >>=	Assignment operators (right to left)
15	,	Comma operator
 */

fun main() {
    println(3+10*2) // priority of operations is * over + or 23
    println((3+10)*2) // parens first, then mult = 26
    println(5-2+6*3/2) // 12
}