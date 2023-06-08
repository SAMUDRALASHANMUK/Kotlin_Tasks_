class June8SettersAndGetters {

    var name: String? = null
        set(value) {
            if (value!!.length < 5) {
                throw Exception("length of name should be gretaer than 5")
            } else {
                field = value
            }
        }
        get() = field

}

fun main() {
    var obj = June8SettersAndGetters()
    println("Enter your name")
    obj.name = readlnOrNull()
    println("Name is ${obj.name}")

}