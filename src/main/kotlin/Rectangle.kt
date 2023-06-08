class Rectangle(var width: Int, var height: Int) {
    val area: Int = width * height
}
fun main(){
    var rectangle = Rectangle(5,7)
    println(rectangle.area)
}