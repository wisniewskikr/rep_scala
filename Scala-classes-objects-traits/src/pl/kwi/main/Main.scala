package pl.kwi.main


import pl.kwi.classes.MainClass
import pl.kwi.abstractclasses.MainAbstractClass
import pl.kwi.traits.MainTrait
import pl.kwi.objects.MainObject

object Main extends App{
    
  println("--- CLASSES ---")
  MainClass.main
  
  println("--- ABSTRACT CLASSES ---")
  MainAbstractClass.main 
  
  println("--- TRAITS ---")
  MainTrait.main
  
  println("--- OBJECTS ---")
  MainObject.main
  
}