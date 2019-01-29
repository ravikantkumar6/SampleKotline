package opps.classdemo

interface Animal {
    fun food()
}

fun main(args: Array<String>) {
    var animal: Animal = object : Animal {
        override fun food() {
            print("Eating Anonymous Inner class ");
        }
    }
    animal.food();
}