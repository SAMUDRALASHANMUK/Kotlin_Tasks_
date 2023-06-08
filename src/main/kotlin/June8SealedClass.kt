sealed class June8SealedClass {
    class Rectangl(var length: Int, var breadth: Int) : June8SealedClass()
    class Square(var side: Int) : June8SealedClass()
    class Circle(var radius: Int) : June8SealedClass()

}


fun main() {

    var rectangl = June8SealedClass.Rectangl(2, 3)
    var square = June8SealedClass.Square(3)
    var circle = June8SealedClass.Circle(3)
    getResult(rectangl)
    getResult(square)
    getResult(circle)


}

fun getResult(shape: June8SealedClass) {
    when (shape) {
        is June8SealedClass.Rectangl -> {
            println("Area of rectangle is ${shape.length * shape.breadth}")
        }

        is June8SealedClass.Square -> {
            println("Area of rectangle is ${shape.side * shape.side}")
        }

        is June8SealedClass.Circle -> {
            println("Area of rectangle is ${3.14 * shape.radius * shape.radius}")
        }

    }
}