sealed class Animal {
    object Cat : Animal()
    object Dog : Animal()
    object Elephant : Animal()

}
fun main1(animal:Animal){
    var msg = when(animal){
        is Animal.Cat -> "Hey i am cat"
        is Animal.Dog -> "Hey i am dog"
        is Animal.Elephant -> "Hey i am elephant"
        else -> {}
    }
    println(msg)

}
fun main(){
    var cat1 = Animal.Cat
    main1(cat1)
}