package pl.kwi

object FunctionsInFunctions {
  
  
  
  /**
	 * Function which contains of inner function.
	 */
  def functionWithInnerFunction(text: String): String = {
  	
  	def testInner(text: String): String = {
  		text
  	}
  	testInner(text)
  	
  }                                               //> functionWithInnerFunction: (text: String)String
  println(functionWithInnerFunction("Some text")) //> Some text
    
  
  
  /**
	 * Function which receives another function as an argument.
	 */
  def functionWithFunctionAsArgument(text: String, f:String => String) = {
  	f(text)
  }                                               //> functionWithFunctionAsArgument: (text: String, f: String => String)String
  /**
	 * Function which is as an argument.
	 */
  def argumentFunction(text: String): String = {
  	text
  }                                               //> argumentFunction: (text: String)String
	println(functionWithFunctionAsArgument("Some text", argumentFunction))
                                                  //> Some text
  

  	  
    
}