ELEMENTS IN SCALA

CLASS

Hierarchy of classes in Scala is similar like in Java. Here is one exception:
when you want to override some mehtod from parent you have to use "override" 
word before function.


ABSTRACT CLASS

Abstract classes in Scala looks similar like in Java.


TRAIT

Traits in Scala replaced interfaces if Java. So in Scala there is nothing like interface.
Difference between trait and interface is that:
- trait can implement function body not only name. So it is more like abstract class then interface;
- if you want to use more then one trait then you should use word "with". For example:
 "Class extends FirstTrait with SecondTrait"


OBJECT

Object is Scala is some kind of singleton in Java. It means that in one application
can be only one object. You can create object without using constructor.