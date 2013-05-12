package pl.kwi.main

import pl.kwi.classes.DefaultConstructorClass
import pl.kwi.classes.NotDefaultConstructorClass
import pl.kwi.classes.MoreConstructorsClass

object Main extends App{
	
  var defaultConstructorClass = new DefaultConstructorClass()
  defaultConstructorClass.method
  
  var notDefaultConstructorClass = new NotDefaultConstructorClass("Some text")
  notDefaultConstructorClass.method
  
  var moreConstructorsClass1 = new MoreConstructorsClass()
  moreConstructorsClass1.method
  
  var moreConstructorsClass2 = new MoreConstructorsClass("Some text")
  moreConstructorsClass2.method
  
}