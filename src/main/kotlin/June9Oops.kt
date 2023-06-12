//Constructor
class Human constructor(var n: String) {
    fun think() {
        var name: String = n
        println("Kotlin is awesome and the name is  $name")
    }

}

//Inheritance
open class People() {
    open fun think() {
        println("They will think normally")
    }
}

class Alien1 : People() {
    override fun think() {
        println("This is aliens and we think by chips")
    }
}

//Abstraction
abstract class Car {
    abstract fun run()
}

class Honda : Car() {
    override fun run() {
        println("Honda is running safely..")
    }
}

abstract class Shape{
    abstract fun find()


}

class Square : Shape(){
    override fun find() {
        println("This is square")
    }
}


interface MyInterface  {
    var id: Int            // abstract property
    fun absMethod():String    // abstract method
    fun doSomthing() {
        println("MyInterface doing some work")
    }
}
class InterfaceImp : MyInterface {
    override var id: Int = 101
    override fun absMethod(): String{
        return "Implementing abstract method.."
    }
}

fun main() {
    //Constructor
    var obj = Human("shanmuk")
    obj.think()

//Inheritance
    var alien: People = Alien1()
    alien.think()

//Abstraction
    val obj2 = Honda()
    obj2.run();

    val obj3 = Square()
    obj3.find()

    //Interface
    val obj4 = InterfaceImp()
    println("Calling overriding id value = ${obj4.id}")
    obj4.doSomthing()
    println(obj4.absMethod())

}

