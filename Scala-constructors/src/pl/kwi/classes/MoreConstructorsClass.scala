package pl.kwi.classes

class MoreConstructorsClass {
  
  var text = "Default text"
  
  def this(text: String) = {
    this()
    this.text = text 
  }
  
  def method = println("Text: '" + text + "' from MoreConstructorsClass")

}