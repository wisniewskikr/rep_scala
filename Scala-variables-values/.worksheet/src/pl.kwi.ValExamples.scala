package pl.kwi

object ValExamples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); 
  
  
  val test1 = "Some text";System.out.println("""test1  : String = """ + $show(test1 ));$skip(40); 
  
  
  val test2: String = "Some text";System.out.println("""test2  : String = """ + $show(test2 ));$skip(42); 
  
  
  val test3: String =
  "Some text";System.out.println("""test3  : String = """ + $show(test3 ));$skip(59); 
  
  
  val test4: String = "Some text " + " Another text";System.out.println("""test4  : String = """ + $show(test4 ));$skip(37); 
  
  val test5: String = "Some text";System.out.println("""test5  : String = """ + $show(test5 ));$skip(65); 
  //test5 = "Another text"
 
 
 	val test6: String = "Some text";System.out.println("""test6  : String = """ + $show(test6 ));$skip(81); 
 	//val test6: String = "Another text"
 	
 	
 	val test7: String = {"Some text"}
 	
 	
 	//val test8: String = {
 	//	"Some text"
 	//}
 	
 	
 	//val test9: String = 1
 	
 	
 	class Test{};System.out.println("""test7  : String = """ + $show(test7 ));$skip(140); 
 	val test10: Test = new Test();System.out.println("""test10  : pl.kwi.ValExamples.Test = """ + $show(test10 ));$skip(46); 
    
  def testFunction: String = "Some text";System.out.println("""testFunction: => String""");$skip(36); 
  val test11: String = testFunction;System.out.println("""test11  : String = """ + $show(test11 ))}
  
  
}
