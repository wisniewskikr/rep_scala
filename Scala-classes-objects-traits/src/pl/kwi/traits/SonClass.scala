package pl.kwi.traits

class SonClass extends GrandfatherTrait with FatherTrait{
  
  def methodSecond = println("Method second implemented in class SonClass")

}