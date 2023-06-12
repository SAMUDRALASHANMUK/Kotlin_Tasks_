fun main(){

    var numberList12:MutableList<Int> = mutableListOf(1,2,3)

numberList12.let {
    it.add(4)
    it.add(5)
    it.add(6)
    println(it)
    it.remove(6)

}
}