package opps.classdemo

class NestedClassDemo {
    class Nested {
        fun nestedMethod() = "Welcome to nested class";
    }
}

fun main(args: Array<String>) {
    val demo = NestedClassDemo.Nested().nestedMethod();
    print(demo);
}