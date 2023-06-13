open class Aliens {

    private var a = 3 //private is accessed within the class only
    protected var b = 4 //protected is accessed within the subclass only
    internal var c = 5 //internal is accessed within the module only
    var d = 6 //public it can be accessed everywhere

}

class Monster : Aliens() {
    //a is not visible here
    //b,c,d is visible
    fun show() {
        println(b)
        println(c)
        println(d)
    }
}

class TestClass {
    fun test() {
        var aliens = Aliens()
        println(aliens.c)
        println(aliens.d)
    }
}

fun main() {
    println("sub class show method")
    var monster = Monster()
    monster.show()
    var testClass = TestClass()
    testClass.test()
}

