import java.util.Scanner

fun main() {

    //if as expression

    var number1 = 10
    var number2 = 20

    var maxNumber = if (number1 > number2) {
        number1
        println("Number1 $number1 is greater than number2 $number2")
    } else {
        number2
        println("Number1 $number1 is greater than number2 $number2")
    }

    //when
    var scan = Scanner(System.`in`)
    println("Please enter the number : ")
    var number = scan.nextInt()

    var result = when (number) {
        1 -> println("result is $number")
        2 -> println("The number is 2")

        else -> {
            println("Out of range")
        }
    }


}
