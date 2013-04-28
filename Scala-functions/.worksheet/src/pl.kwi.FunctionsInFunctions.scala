package pl.kwi

object FunctionsInFunctions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(258); 
  
  
  
  /**
	 * Function which contains of inner function.
	 */
  def functionWithInnerFunction(text: String): String = {
  	
  	def testInner(text: String): String = {
  		text
  	}
  	testInner(text)
  	
  };System.out.println("""functionWithInnerFunction: (text: String)String""");$skip(50); 
  println(functionWithInnerFunction("Some text"));$skip(173); 
    
  
  
  /**
	 * Function which receives another function as an argument.
	 */
  def functionWithFunctionAsArgument(text: String, f:String => String) = {
  	f(text)
  };System.out.println("""functionWithFunctionAsArgument: (text: String, f: String => String)String""");$skip(110); 
  /**
	 * Function which is as an argument.
	 */
  def argumentFunction(text: String): String = {
  	text
  };System.out.println("""argumentFunction: (text: String)String""");$skip(72); 
	println(functionWithFunctionAsArgument("Some text", argumentFunction))}
  

  	  
    
}
