package pl.kwi

object FunctionsReturnFunctions {
  
  
  /**
	 * Function returns function what is defined in explicit way.
	 */
  def add_functionReturnsFunction_explicit(x:Int): (Int) => Int = {
  	(y:Int) => x + y
  }                                               //> add_functionReturnsFunction_explicit: (x: Int)Int => Int
	var returnedFunctin_explicit =
		add_functionReturnsFunction_explicit(2)
                                                  //> returnedFunctin_explicit  : Int => Int = <function1>
	println(returnedFunctin_explicit(3))      //> 5
	
	
	
	/**
	 * Function returns function what is defined in implicit way.
	 * It is not written down but compiler can imagine it by returned value.
	 */
	def add_functionReturnsFunction_implicit(x:Int) = {
		(y:Int) => x + y
	}                                         //> add_functionReturnsFunction_implicit: (x: Int)Int => Int
	var returnedFunction_implicit =
		add_functionReturnsFunction_implicit(2)
                                                  //> returnedFunction_implicit  : Int => Int = <function1>
	println(returnedFunction_implicit(3))     //> 5
  
  
  
}