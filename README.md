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
  - [**Nested Class**](src/opps/classdemo/NestedClassDemo.kt)
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
  - [**Inner Class**](src/opps/classdemo/InnerClassDemo.kt)
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
  - [**Anonymous Inner Class**](src/opps/classdemo/AnonymousClassDemo.kt)
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
  
  ##Constructor
   Kotlin has two types of constructor - one is the [**`Primary constructor`**](src/opps/constructordemo/PrimaryConstructorDemo.kt) and the other is the [**`Secondary constructor`**](src/opps/constructordemo/SecondaryConstructorDemo.kt).

- `Primary constructor` initializes the class.
- `secondary constructor` helps to include some extra logic while initializing the same.
- `Primary constructor` can be declared at class header level.
- Kotlin allows to create **`one or more secondary constructors`** for your class.
- All of secondary constructors should call the primary constructor directly or indirectly.