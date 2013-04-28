package pl.kwi

object FunctionsAnonymous {
  
  
  
  /**
	 * Anonymous function means function which does not have
	 * name. So variable can have anonimous function as a body.
	 */
  var varWithAnonymousFunction = (text: String) => text
                                                  //> varWithAnonymousFunction  : String => String = <function1>
  println(varWithAnonymousFunction("Some text"))  //> Some text
  
  
  
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
  
  
}