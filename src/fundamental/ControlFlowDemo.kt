package fundamental

fun main(args: Array<String>) {
    forLoopDemo();
    whileLoopDemo();
    doWhileLoopDemo();
    breakAndContinueDemo();
}

fun forLoopDemo() {
    print("***** For Loop Demo *****")
    val itemSelectable = listOf<Int>(1, 3, 5, 7, 9);
    for (item in itemSelectable) {
        println("$item");
    }
    for ((index, item) in itemSelectable.withIndex()) println("Item :: $item And Index :: $index");
}

fun whileLoopDemo() {
    println("***** While Loop Demo *****")
    val itemSelectable = listOf<Int>(1, 3, 5, 7, 9);
    var x: Int = 0
    while (itemSelectable.size > x) {
        println(x)
        x++
    }
}

fun doWhileLoopDemo() {
    println("***** Do While Loop Demo *****")
    val itemSelectable = listOf<Int>(1, 3, 5, 7, 9);
    var x: Int = 0
    do {
        println(x)
        x++
    } while (itemSelectable.size > x);
}

fun breakAndContinueDemo() {
    println("***** Break And Continue Demo *****")
    myLabel@ for (x in 1..10) {
        if (x == 5) {
            println("I am inside if block with value" + x + "\n-- hence it will close the operation")
            break@myLabel;
        } else {
            println("I am inside else block with value" + x)
            continue@myLabel;
        }
    }
}