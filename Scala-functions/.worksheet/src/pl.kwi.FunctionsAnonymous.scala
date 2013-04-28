package pl.kwi

object FunctionsAnonymous {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(238); 
  
  
  
  /**
	 * Anonymous function means function which does not have
	 * name. So variable can have anonimous function as a body.
	 */
  var varWithAnonymousFunction = (text: String) => text;System.out.println("""varWithAnonymousFunction  : String => String = """ + $show(varWithAnonymousFunction ));$skip(49); 
  println(varWithAnonymousFunction("Some text"));$skip(311); 
  
  
  
  /**
	 * Currying is used when your function returns function.
	 * To simplify it in Scala you don`t have to call first
	 * function, pass arguments and call second function.
	 * You can in advance call first functio with two arguments.
	 */
	def add_curryingFunction(x:Int) = {
		(y:Int) => x + y
	};System.out.println("""add_curryingFunction: (x: Int)Int => Int""");$skip(37); 
	println(add_curryingFunction(2)(3))}
  
  
}
