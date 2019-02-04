package opps.constructordemo

class SecondaryConstructorDemo (val name: String, var age: Int)  {
    val message:String  = "Hello !!!"
    constructor(name : String , age :Int ,message :String):this(name,age) {
    }
}

fun main(args: Array<String>){
    val secondaryConstructorDemo = SecondaryConstructorDemo("Ravikant Kumar", 30)
    print("${secondaryConstructorDemo.message}"+"${secondaryConstructorDemo.name}"+
            " Welcome to the example of Secondary  constructor, Your Age is-${secondaryConstructorDemo.age}")
}