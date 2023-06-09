class June8ScopedFunctions {
    var name: String = "shanmuk"
    var age: Int = 18
}

fun main() {
    var person = June8ScopedFunctions()
    println("without scoped functions ${person.name}")
    println("without scoped functions ${person.age}")
//with scoped function
    var message: String = with(person) {
        println("By using scoped functions the name is $name")
        println("By using scoped functions the age is $age")
        "This code has executed successfully"
    }

    println("result 0f with block is $message")

    //apply scoped function
    var person2 = June8ScopedFunctions().apply {
        name = "S Shanmuk"
        age = 22
        println("name using apply is $name")
        println("age using apply is $age")


    }
    //also scoped function
    var list: MutableList<Int> = mutableListOf(1, 2, 3)

    list.also {

        it.add(1)
        it.add(4)
        it.remove(3)
        println(it)

    }


}