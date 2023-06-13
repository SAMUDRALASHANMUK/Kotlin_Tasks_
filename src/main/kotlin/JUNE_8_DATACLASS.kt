data class June8DataClass(var name: String, var id: Int) {

}

fun main() {
    var person1 = June8DataClass("shanmuk", 93);
    var person2 = June8DataClass("shanmuk", 93)
    println("Details of person1 are $person1")
    println("Comparing both person1 and person2 ${person1 == person2}")
    var person3 = person1.copy(id = 25)
    println("Person details by using copy is $person3")
}


