fun main1() {

    var list: MutableList<Int> = mutableListOf(1, 2, 3)

    list.also {

        it.add(1)
        it.add(4)
        it.remove(3)
        println(it)

    }

}

fun main() {
    val numberList: MutableList<String> = mutableListOf("s", "h", "a", "n", "m")

    numberList.also {
        it.add("u")
        it.add("k")
        println("List values are $it")
    }
}


