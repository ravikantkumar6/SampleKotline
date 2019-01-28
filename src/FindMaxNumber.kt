fun main(args: Array<String>){
    val a:Int = 5
    val b:Int = 2
    var max: Int

    if (a > b) {
        max = a
    } else {
        max = b
    }
    println("Maximum of a or b is " +max)

    // As expression
    max = if (a > b) a else b
    print("Maximum of a or b is " +max)
}