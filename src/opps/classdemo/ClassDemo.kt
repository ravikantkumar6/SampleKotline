package opps.classdemo

class ClassDemo {
    private var name: String = "Class Demo";
    fun printMe() {
        print("Named :: $name")
    }
}

fun main(args: Array<String>) {
    val obj = ClassDemo()
    obj.printMe();
}