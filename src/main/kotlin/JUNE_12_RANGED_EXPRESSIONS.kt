fun main() {

    val i: Int = 2
    // equivalent of i >= 1 && i <= 4
    if (i in 1..5)
        println(i)
    println()
    for (y in 1..5) {
        println(y)
    }
    println()
    for (x in 5 downTo 1) {
        println(x)
    }
    println()
    for (a in 1..10 step 2) {
        println("using step 2 : $a")
    }
    println()
    for (b in 10 downTo 1 step 1) {
        println("using down to and step : $b")
    }
    println()
    for (c in 1 until 10) {
        println("using until results is : $c")
    }
//    for(i in 'A'..'Z'){
//        println(i)
//    }
    var s= 'A'..'Z'
    s.forEach { println(it) }
}
