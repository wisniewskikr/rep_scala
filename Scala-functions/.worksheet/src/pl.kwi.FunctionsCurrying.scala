package pl.kwi

object FunctionsCurrying {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(350); 
  
	
	
	/**
	 * Currying is used when your function returns function.
	 * To simplify it in Scala you don`t have to call first
	 * function, pass arguments and call second function.
	 * You can in advance call first functio with two arguments.
	 */
	def add_curryingFunction(x:Int) = {
		(y:Int) => x + y
	};System.out.println("""add_curryingFunction: (x: Int)Int => Int""");$skip(37); 
	println(add_curryingFunction(2)(3));$skip(121); 
	
	
	
	/**
	 * Ordinary functin returns function.
	 */
	def add_functionReturnsFunction(x:Int) = {
		(y:Int) => x + y
	};System.out.println("""add_functionReturnsFunction: (x: Int)Int => Int""");$skip(55); 
	var returnedFunction = add_functionReturnsFunction(2);System.out.println("""returnedFunction  : Int => Int = """ + $show(returnedFunction ));$skip(30); 
	println(returnedFunction(3))}
  
  
  
}
