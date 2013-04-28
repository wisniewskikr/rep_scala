SCALA AND HELLO WORLD MESSAGE

If you want to display "Hello World" message you have to:

1. Put main() function into object instead of class 
Object means that it is singleton. Because in project
should be only one main() method that`s why compiler
forces object instead of class.

2. Use main() method without extension App
This main method works in similar way as in Java.

3. Use extension App without main() method
In Scala you can also use sentence "extension App"
and then you don`t have to use main method. All in 
your object will be treated as it was in main() method.



---



COMPILE AND RUN FROM COMMAND LINE

Go to location: src

1. Compile
scalac pl/kwi/HelloWorldWithExtends.scala

2. Run
scala pl.kwi.HelloWorldWithExtends 