fun main(args: Array<String>) {


    //Kotlin variables

//name cannot be changed
    val name = "Shanmuk"
    val name1:String = "shanmuk"
    println("name is $name")
    println("name is "+name)

//salary can be changed
    var salary = 12
    var salary1:Int = 12
    println("salary is $salary")


//Strings escaped string
    val string1 = "abcd\n123"
    val string2 = "abcd 123"
    val string3 = "abcd\t123"
    println("String 1 is $string1")
    println("string 2 is $string2")
    println("string 3 is $string3")

    //raw string using triple quotes
    val string4 = """
        This is shanmuk....
            Intern
        In market simplified
    """.trimIndent()
println(string4)

//Arithmetic Operators
    var number1 = 10;
    var number2 = 5;
    println(number1+number2);
    println(number1-number2);
    println(number1*number2);
    println(number1/number2);
    println(number1%number2);

//relational operators
    val max = if (number1 > number2) {
        println("number1 is greater than number2.")
        number1
    } else if(number1 < number2){
        println("number2 is greater than number1.")
        number2
    }
    else{
        println("number1 is equal to number2.")
        number1
    }
    println("max = $max")

    //Assignment operators

    number1+= number2
    println("number1+=number2 :$number1")
    number1-= number2
    println("number1-=number2 :$number1")
    number1*=number2
    println("number1*=number2 :$number1")
    number1/= number2
    println("number1/=number2 :$number1")
    number1%=number2
    println("number1%=number2 :$number1")

    //unary operators
    var flag = true
    println("+number1 :"+ +number2)
    println("-number1 :"+ -number2)
    println("++number1 :"+ ++number2)
    println("--number1 :"+ --number2)
    println("!flag :"+ !flag)

    //logical operators
    var number3=10
    var number4=15
    var number5 = 20
    var result = (number3>number4)&&(number4>number5)
    println(result)

    //Conditional statements
    val max1 = if (number1 > number2) {
        println("number1 is greater than number2.")
        number1
    } else if(number1 < number2){
        println("number2 is greater than number1.")
        number2
    }
    else{
        println("number1 is equal to number2.")
        number1
    }
    println("max1 = $1")

    //when
    var number = 4
    var numberProvided = when(number) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        else -> "invalid number"
    }
    println("You provide $numberProvided")
//for loop
var sentence = "This is kotlin code"
    for(char in sentence){
        println(char)
    }

    for(i in 1..5)
    {
        println(i)
    }
//while
    var i = 1
    while (i<=5){
        println(i)
        i++
    }

    //functions without parameter
    square()

    //parameter function
    println(add(1,2))


}
fun square()
{
    var number = 25
    var result = Math.sqrt(number.toDouble())
    println("result is $result")
}

fun add(a:Int,b:Int):Int{
    return a+b
}
