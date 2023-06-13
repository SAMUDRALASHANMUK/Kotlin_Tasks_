//KOTLIN NULLABILITY

fun main() {

    //getting compile time error while assigning like this
    // var name : String = null
    //we can assign null values like this
    var name: String? = null
    println("name is $name")

    //in java, we will get null pointer exception when we are trying to get the length of a null string while in kotlin it is safe we won't get that exception
    println("Length of a string using null safety operator is ${name?.length}")

    //let operator
    var name1: String? = null
    name1?.let {
        println("Length of a string using let operator is ${name1.length}")
    }

    //Elvis operator
    var length = name1?.length ?: -1
    println("Length using elvis operator is $length")

    //Non-null assertion
    var name2: String? = null
    println("Length using non null assertion is ${name2!!.length}")
}