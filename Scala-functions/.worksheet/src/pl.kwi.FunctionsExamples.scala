package pl.kwi

object FunctionsExamples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(173); 
  
  
  
  /**
	 * Function without arguments and with explicit return.
	 */
  def function_withoutArguments: String = "Some text";System.out.println("""function_withoutArguments: => String""");$skip(37); 
  println(function_withoutArguments);$skip(138); 
  
  
  
  /**
	 * Function without arguments and with implicit return.
	 */
  def function_withoutArguments_implicitResult = "Some text";System.out.println("""function_withoutArguments_implicitResult: => String""");$skip(52); 
  println(function_withoutArguments_implicitResult);$skip(129); 
  
  
  /**
	 * Function with arguments and with explicit return.
	 */
  def function_withArguments(text: String): String = text;System.out.println("""function_withArguments: (text: String)String""");$skip(47); 
  println(function_withArguments("Some text"));$skip(139); 
  
  
  
  /**
	 * Function with arguments and with implicit return.
	 */
  def function_withArguments_implicitResult(text: String) = text;System.out.println("""function_withArguments_implicitResult: (text: String)String""");$skip(62); 
  println(function_withArguments_implicitResult("Some text"));$skip(109); 
  
   
  /**
	 * Function with body in new line.
	 */
  def function_newLine(text: String): String =
  	text;System.out.println("""function_newLine: (text: String)String""");$skip(41); 
  println(function_newLine("Some text"));$skip(157); 

  
  
  /**
	 * Function with body in block.
	 */
  def function_block(text: String): String = {
  	var text2: String = " + Other text"
  	text + text2
  };System.out.println("""function_block: (text: String)String""");$skip(39); 
  println(function_block("Some text"));$skip(138); 
  
  
  
  /**
	 * Function with body in block.
	 */
  def function_explicitReturn(text: String): String = {
  	text
  	return "Test"
  };System.out.println("""function_explicitReturn: (text: String)String""");$skip(48); 
  println(function_explicitReturn("Some text"));$skip(132); 



  /**
	 * Function with implicit return.
	 */
  def function_implicitReturn(text: String) = {
  	text
  	var x: Int = 4
  	x
  };System.out.println("""function_implicitReturn: (text: String)Int""");$skip(48); 
  println(function_implicitReturn("Some text"));$skip(114); 
  
  
  /**
	 * Function without return.
	 */
  def function_withoutReturn(text: String) = {
  	println(text)
  };System.out.println("""function_withoutReturn: (text: String)Unit""")}
    
  
}
