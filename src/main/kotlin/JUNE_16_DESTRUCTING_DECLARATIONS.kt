
/*
*In Kotlin, destructuring declarations provide a convenient way to extract multiple values from a single object or data structure.
*  It allows you to assign values from different properties of an object or elements of a collection to multiple variables in a concise manner.
* Destructuring declarations work with any object that provides component functions or extension functions with specific names.
* These component functions or extension functions define how the object should be destructured.
*/

data class Person1(var name: String, var age: Int)


fun main() {
    //Destructing a pair
    val pair = Pair("John", 25)
    val (name, age) = pair

    println(name) // Output: John
    println(age) // Output: 25
//Destructing a data class
    val person: Person1 = Person1("Shanmuk", 22)
    println(person.name)
    println(person.age)
//Destructing a for loop
    val people = listOf(Person1("Alice", 25), Person1("Bob", 30))

    for ((name, age) in people) {
        println("$name is $age years old")
    }

}