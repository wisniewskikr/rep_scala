package pl.kwi

object FunctionsExamples {
  
  
  
  /**
	 * Function without arguments and with explicit return.
	 */
  def function_withoutArguments: String = "Some text"
                                                  //> function_withoutArguments: => String
  println(function_withoutArguments)              //> Some text
  
  
  
  /**
	 * Function without arguments and with implicit return.
	 */
  def function_withoutArguments_implicitResult = "Some text"
                                                  //> function_withoutArguments_implicitResult: => String
  println(function_withoutArguments_implicitResult)
                                                  //> Some text
  
  
  /**
	 * Function with arguments and with explicit return.
	 */
  def function_withArguments(text: String): String = text
                                                  //> function_withArguments: (text: String)String
  println(function_withArguments("Some text"))    //> Some text
  
  
  
  /**
	 * Function with arguments and with implicit return.
	 */
  def function_withArguments_implicitResult(text: String) = text
                                                  //> function_withArguments_implicitResult: (text: String)String
  println(function_withArguments_implicitResult("Some text"))
                                                  //> Some text
  
   
  /**
	 * Function with body in new line.
	 */
  def function_newLine(text: String): String =
  	text                                      //> function_newLine: (text: String)String
  println(function_newLine("Some text"))          //> Some text

  
  
  /**
	 * Function with body in block.
	 */
  def function_block(text: String): String = {
  	var text2: String = " + Other text"
  	text + text2
  }                                               //> function_block: (text: String)String
  println(function_block("Some text"))            //> Some text + Other text
  
  
  
  /**
	 * Function with body in block.
	 */
  def function_explicitReturn(text: String): String = {
  	text
  	return "Test"
  }                                               //> function_explicitReturn: (text: String)String
  println(function_explicitReturn("Some text"))   //> Test



  /**
	 * Function with implicit return.
	 */
  def function_implicitReturn(text: String) = {
  	text
  	var x: Int = 4
  	x
  }                                               //> function_implicitReturn: (text: String)Int
  println(function_implicitReturn("Some text"))   //> 4
  
  /**
	 * Function without return.
	 */
  def function_withoutReturn(text: String) = {
  	println(text)
  }                                               //> function_withoutReturn: (text: String)Unit
  
  
}