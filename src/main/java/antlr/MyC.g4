grammar MyC;

prog
    :   one_desc prog
    |
    ;

one_desc
    :   data
    |   classStr
    |   'void main() ' desc_fun
    |   constStr
    ;

classStr
    :   'class ' id ' {' desc_class '};'
    ;

desc_class
    :   data desc_class
    |
    ;

type
    :   'int '
    |   'char '
    |   id ' '

    ;

id
    :   letter endL
    ;

letter
    :   'a'
    |   'b'
    |   'c'
    |   'd'
    |   'A'
    |   'B'
    |   'C'
    |   'D'
    ;

endL
    :   letter endL
    |   num endL
    |
    ;

num
    :   '0'
    |   '1'
    |   '2'
    |   '3'
    |   '4'
    |   '5'
    |   '6'
    |   '7'
    |   '8'
    |   '9'
    ;

many_num
    :   many_num num
    |   num
    ;

data
    :   type list ';'
    ;

list
    :   variable list1
    ;

list1
    :   ',' variable list1
    |
    ;

variable
    :   id size_array may_assign
    ;

size_array
    :   '[' array_size_num ']' size_array
    |
    ;

array_size_num
    : id
    | num
    ;

may_assign
    :   '=' expression
    |
    ;

expression
    :   a1
    |   '{' many_expression '}'
    ;

many_expression
    :   expression many_expression1
    ;

many_expression1
    :   ',' expression many_expression1
    |
    ;

constStr
    :   'const' type id '=' num ';'
    ;

a1
    :   a2 a1_
    ;

a1_
    :   '||' a2 a1_
    |   '&&' a2 a1_
    |   '==' a2 a1_
    |
    ;

a2
    :   a3 a2_
    ;

a2_
    :   '>' a3 a2_
    |   '>=' a3 a2_
    |   '<' a3 a2_
    |   '<=' a3 a2_
    |
    ;

a3
    :   a4 a3_
    ;

a3_
    :   '+' a4 a3_
    |   '-' a4 a3_
    |
    ;

a4
    :   a5 a4_
    ;

a4_
    :   '*' a5 a4_
    |   '/' a5 a4_
    |   '%' a5 a4_
    |
    ;

a5
    :   id
    |   many_num
    |   id_intern_elem
    |   '(' a1 ')'
    ;

desc_fun
    :   '{' content_desc '}'
    ;

content_desc
    :   desc content_desc
    |
    ;

desc
    :   data
    |   constStr
    |   operator
    ;

operator
    :   desc_fun
    |   if
    |   assign
    ;

assign
    :   id_intern_elem '=' expression ';'
    |   id '=' expression ';'
    ;

id_intern_elem
    :   id elem_array id_intern_elem1
    ;

id_intern_elem1
    :   '.' id elem_array id_intern_elem1
    |
    ;

elem_array
    :   id_intern_elem '[' expression ']'
    |
    ;

if
    :   'if' '(' expression ')' operator may_else
    ;

may_else
    :   'else' operator
    |
    ;