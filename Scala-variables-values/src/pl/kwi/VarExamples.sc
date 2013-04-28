package pl.kwi

object VarExamples {
  
  
  var test1 = "Some text"                         //> test1  : String = Some text
  
  
  var test2: String = "Some text"                 //> test2  : String = Some text
  
  
  var test3: String =
  "Some text"                                     //> test3  : String = Some text
  
  
  var test4: String = "Some text " + " Another text"
                                                  //> test4  : String = Some text  Another text
  
  var test5: String = "Some text"                 //> test5  : String = Some text
  test5 = "Another text"
 
 
 	var test6: String = "Some text"           //> test6  : String = Some text
 	//var test6: String = "Another text"
 	
 	
 	var test7: String = {"Some text"}         //> test7  : String = Some text
 	
 	
 	//var test8: String = {
 	//	"Some text"
 	//}
 	
 	
 	//var test9: String = 1
 	
 	
 	class Test{}
 	var test10: Test = new Test()             //> test10  : pl.kwi.VarExamples.Test = pl.kwi.VarExamples$$anonfun$main$1$Test$
                                                  //| 1@1c05ffd
  
  def testFunction: String = "Some text"          //> testFunction: => String
  var test11: String = testFunction               //> test11  : String = Some text
  
  
}