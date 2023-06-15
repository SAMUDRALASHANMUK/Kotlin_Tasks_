fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}
fun main6() {
    val addition = { x: Int, y: Int -> x + y }

    val result = calculate(5, 3, addition)
    println(result) // Output: 8

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val evenNumbers = numbers.filter { it % 2 == 0 }

    println(evenNumbers) // Output: [2, 4, 6, 8, 10]

}

fun add(a:Int,b:Int,myLamda:(Int) -> Unit){
    var sum = a+b
    myLamda(sum)
}
fun main(){
    var myLambda:(Int) -> Unit = {s:Int -> println(s) }
}