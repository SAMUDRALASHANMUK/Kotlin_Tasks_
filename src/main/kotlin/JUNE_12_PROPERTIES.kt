import java.lang.IllegalArgumentException

class Person {
    var name: String = "shanmuk"
}

class Person2 {
    val name: String = "shanmuk"
}

class Person3 {
    var age: Int = 19
        set(value) = if (age > 18) {
            field = value
        } else {
            throw IllegalArgumentException("Age should be greatee than 18")
        }
}

class Car1 {
    var carName: String = "Honda"
    var name: String = ""
}


fun main() {

    //Readable and writable property
    val person = Person();
    println(person.name)
    person.name = "shannu"
    println(person.name)

    //readable
    val person2 = Person2();
    println(person.name)

    //Custom setter
    var person3 = Person3()
    println(person3.age)
    person3.age = 19

    //default values
    var car1 = Car1()
    println(car1.carName)
    println(car1.name)
    car1.name = "shanmuk"
    println(car1.carName)
    println(car1.name)



}