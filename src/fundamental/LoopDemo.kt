package fundamental

fun main(args: Array<String>){
    val itemSelectable = listOf<Int>(1, 3,5,7,9);

    for (item in itemSelectable){ println("$item");}
    for ((index, item) in itemSelectable.withIndex()) println("Item :: $item And Index :: $index");
}