FUNCTION EXAMPLES
In Scala you can write functions in following way:
- with or without arguments:
  without arguments means without brackets;
- with explicit or implicit return: 
  implicit return means that function returns last line
- without return:
  function also is able to return nothing
  
  
  
FUNCTIONS IN FUNCTIONS
In Scala you can also:
- pass function as an argument;
- define function inside function



FUNCTIONS RETURN FUNCTION
In Scala you can also:
- return function in explicit way;
- return functin in implicit way.



FUNCTION ANONYMOUS
In Scala you can create anonymous function. It means function which 
does not have name. You can do with such function following things:
- you can connect anonymous function with variable;
- you can use it during currying.



FUNCTIONS CURRYING
Currying is used when your function returns anonymous function.
To simplify it in Scala you don`t have to call first function, 
pass arguments and call second function. You can in advance call 
first function with two arguments. Currying example:
add_curryingFunction(2)(3)
     