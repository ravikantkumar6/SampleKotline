package opps.constructordemo

class PrimaryConstructorDemo(val name: String, var age: Int)  {

}

fun main(args :Array<String>){

    var primaryConstructorDemo = PrimaryConstructorDemo("Ravikant Kumar",  30);
    println("Name :: ${primaryConstructorDemo.name}")
    println("Age :: ${primaryConstructorDemo.age}")
    //Deffremce between ${} and $ only.
    //    var cource = "MCA";
//    println("Cource :: $cource")
}