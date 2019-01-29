package opps.classdemo

class InnerClassDemo {
    private val welcomeMessage: String = "Welcome to nested class";

    inner class Inner {
        fun innerMethod() = welcomeMessage;
    }
}

fun main(args: Array<String>) {
    val demo = InnerClassDemo().Inner().innerMethod();
    print(demo);
}