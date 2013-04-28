package pl.kwi

object ValExamples {
  
  
  val test1 = "Some text"                         //> test1  : String = Some text
  
  
  val test2: String = "Some text"                 //> test2  : String = Some text
  
  
  val test3: String =
  "Some text"                                     //> test3  : String = Some text
  
  
  val test4: String = "Some text " + " Another text"
                                                  //> test4  : String = Some text  Another text
  
  val test5: String = "Some text"                 //> test5  : String = Some text
  //test5 = "Another text"
 
 
 	val test6: String = "Some text"           //> test6  : String = Some text
 	//val test6: String = "Another text"
 	
 	
 	val test7: String = {"Some text"}         //> test7  : String = Some text
 	
 	
 	//val test8: String = {
 	//	"Some text"
 	//}
 	
 	
 	//val test9: String = 1
 	
 	
 	class Test{}
 	val test10: Test = new Test()             //> test10  : pl.kwi.ValExamples.Test = pl.kwi.ValExamples$$anonfun$main$1$Test$
                                                  //| 1@1c05ffd
    
  def testFunction: String = "Some text"          //> testFunction: => String
  val test11: String = testFunction               //> test11  : String = Some text
  
  
}