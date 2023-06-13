object MySingleton {
    fun doSomething() {
        println("Doing something...")
    }

    val someProperty: String = "Singleton Property"
}

fun main() {
    MySingleton.doSomething()  // Output: Doing something...

    println(MySingleton.someProperty)  // Output: Singleton Property
}
