fun main() {

    val number: Int = 10
    val largerNumber: Long = number.toLong() // Implicit conversion from Int to Long
    val decimalNumber: Float = number.toFloat() // Implicit conversion from Int to Float

    println(largerNumber)
    println(decimalNumber)

    val value: Double = 3.14
    val intValue: Int = value.toInt() // Explicit conversion from Double to Int
    val stringValue: String = value.toString() // Explicit conversion from Double to String
    println(intValue)
    println(stringValue)


    var a = 65
    var b = a.toChar()
    println(b)
}