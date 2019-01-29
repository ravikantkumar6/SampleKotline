# Sample Kotline

## Project setup
### Create
  `File -> project -> kotline -> kotline/jvm`
### Configuration
Set `src` folder as `source folder`.
### First step to write code
Create a `kotline file`
# Types of Variables
|  Type | Size  |  Type | Size  |
|---|:---:|---|:---:|
| **Long**  |  64 | **Double**  | 64  |
| **Int**  | 32  | **Float**  |  32 | 
| **Byte**  |  8 | **Short**  |  16 | 


# when
### Syntax 
>Syntax of when in kotlin similar to case in java
 ``` kotlin
 when(condition){
     key1 -> statement
     key2 -> statement
     else ->{statement}
 }
 ```
 # Control Flow
 >Syntax of ```For``` and ```while``` in ```kotlin``` similar to ```java```
 
 |  Type | Syntax  |
 |---|---|
 | **For**  | ``` for (item in itemSelectable){ println("$item");}```| 
 | |```for ((index, item) in itemSelectable.withIndex()) println("Item :: $item And Index :: $index"); ``` |
 | **While**  |``` while(condition) {statement increatment/decrement} ```  ```Same as java ``` | 
 | **Do While**  | ```Same as java ``` |
 | **break**  | ```myLabel@ for(x in 1..10) {if(x == 5) { println("Break") break@myLabel  } ``` |
 | **continue**  | ```myLabel@ for(x in 1..10) {if(x == 5) { println("Continue") continue@myLabel  } ```  |
 
 ## Class & Object 
  
- Same as java
- Class can have data member and member function.
  ```kotlin
  class myClass {
       // property (data member)
       private var name: String = "Class Demo";
       // member function
       fun printMe() {
          print("Named :: $name")
       }
  } 
   fun main(args: Array<String>) {
       val obj = myClass() 
       obj.printMe();
   }
   ```

 ### Types of Class
  - **Nested Class**
  ```kotlin
    class Outer {
         class Nested {
            fun nestedMethod() = "Welcome to nested class";
         }
      }
      fun main(args: Array<String>) {
           val demo = Outer.Nested().nestedMethod();
           print(demo);
       }
   ```
  - **Inner Class**
  ```kotlin
    class Outer {
       private val welcomeMessage: String = "Welcome to nested class";
       inner class Inner {
          fun innerMethod() = welcomeMessage;
       }
    }
    fun main(args: Array<String>) {
        val demo = Outer().Inner().innerMethod();
        print(demo);
    }
```
  - [**Anonymous Inner Class**](../../tree/master/src/oops/classdemo/AnonymousClassDemo.kt)
    ```kotlin
    interface Animal {
        fun food()
    }
    fun main(args: Array<String>) {
        var animal :Animal = object:Animal {
           override fun food() {
                print("Eating Anonymous Inner class ");
           }
        }
        animal.food();
    }
  ```
