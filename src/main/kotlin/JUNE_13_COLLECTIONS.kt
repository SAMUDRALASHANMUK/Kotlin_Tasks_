fun main(){

    //immutable list we cannot add or change the elements
    var noList = listOf<Int>(1,2,3)
    println("List is $noList")

    var f = ArrayList<Int>()
    f.add(2)


    //mutable list we can add remove and change elements
    var numberList = mutableListOf<Int>()
    numberList.add(4)
    numberList.add(5)


}