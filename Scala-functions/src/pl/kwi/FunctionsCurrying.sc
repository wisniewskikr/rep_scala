package pl.kwi

object FunctionsCurrying {
  
	
	
	/**
	 * Currying is used when your function returns function.
	 * To simplify it in Scala you don`t have to call first
	 * function, pass arguments and call second function.
	 * You can in advance call first functio with two arguments.
	 */
	def add_curryingFunction(x:Int) = {
		(y:Int) => x + y
	}                                         //> add_curryingFunction: (x: Int)Int => Int
	println(add_curryingFunction(2)(3))       //> 5
	
	
	
	/**
	 * Ordinary functin returns function.
	 */
	def add_functionReturnsFunction(x:Int) = {
		(y:Int) => x + y
	}                                         //> add_functionReturnsFunction: (x: Int)Int => Int
	var returnedFunction = add_functionReturnsFunction(2)
                                                  //> returnedFunction  : Int => Int = <function1>
	println(returnedFunction(3))              //> 5
  
  
  
}