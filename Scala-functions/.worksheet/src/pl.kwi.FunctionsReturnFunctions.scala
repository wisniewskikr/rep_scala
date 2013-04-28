package pl.kwi

object FunctionsReturnFunctions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(221); 
  
  
  /**
	 * Function returns function what is defined in explicit way.
	 */
  def add_functionReturnsFunction_explicit(x:Int): (Int) => Int = {
  	(y:Int) => x + y
  };System.out.println("""add_functionReturnsFunction_explicit: (x: Int)Int => Int""");$skip(74); 
	var returnedFunctin_explicit =
		add_functionReturnsFunction_explicit(2);System.out.println("""returnedFunctin_explicit  : Int => Int = """ + $show(returnedFunctin_explicit ));$skip(38); 
	println(returnedFunctin_explicit(3));$skip(228); 
	
	
	
	/**
	 * Function returns function what is defined in implicit way.
	 * It is not written down but compiler can imagine it by returned value.
	 */
	def add_functionReturnsFunction_implicit(x:Int) = {
		(y:Int) => x + y
	};System.out.println("""add_functionReturnsFunction_implicit: (x: Int)Int => Int""");$skip(75); 
	var returnedFunction_implicit =
		add_functionReturnsFunction_implicit(2);System.out.println("""returnedFunction_implicit  : Int => Int = """ + $show(returnedFunction_implicit ));$skip(39); 
	println(returnedFunction_implicit(3))}
  
  
  
}
