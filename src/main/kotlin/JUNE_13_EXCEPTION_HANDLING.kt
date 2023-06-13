fun main() {

    try {
        val result = 10 / 0 // Division by zero
        println("Result: $result")
    } catch (e: ArithmeticException) {
        println("An error occurred: ${e.message}")
    }
    finally {
        println("program completed!!")
    }
}
