import java.util.Scanner
import java.math.BigDecimal

/*
*Today's Task

Create a class called ShoppingCart that represents a shopping cart for an e-commerce website.
*  Implement methods for adding items to the cart,
*  removing items,
* calculating the total price,
* and applying discounts.
* Use the let function to calculate the discounted price.
*
 */

class ShoppingCart {
    fun addItem(scanner: Scanner, hashMap: MutableMap<String, Int>, hashCart: MutableMap<String, Int>) {

        println("How many items you want to add")
        val number = scanner.nextInt()
        if (number > 0) {
            for (i in 1..number) {
                println("Enter the item")
                val item = readln()
                if (item in hashMap.keys && item !in hashCart.keys) {
                    hashMap[item]?.let { hashCart.put(item, it) }

                } else if (item in hashCart.keys) {
                    hashCart.replace(item, hashCart[item]!! + hashMap[item]!!)
                } else {
                    println("Item not found")
                }
            }
            println("After adding elements the cart items are $hashCart")
        } else {
            println("Unable to perform add with the given input")
        }

    }

    fun removeItem(scanner: Scanner, hashCart: MutableMap<String, Int>) {
        println("Enter the number of items you are going to remove")
        val number = scanner.nextInt()
        if (number > 0) {
            for (i in 1..number) {
                println("Enter the item")
                val item = readln()
                if (item in hashCart.keys && hashCart.isNotEmpty()) {
                    hashCart.remove(item)
                } else if (item !in hashCart.keys && hashCart.isNotEmpty()) {
                    println("Item not found")
                } else {
                    println("Hashcart is empty")
                }
            }
            println("Items in your cart are $hashCart")
        } else {
            println("Unable to perform remove with the given input")
        }
    }

    fun calculatePrice(hashCart: MutableMap<String, Int>, sum: Int): Int {
        var Sum = sum

        if (hashCart.isNotEmpty()) {
            for (item in hashCart.values) {
                Sum += item


            }
            println("Cart price is $Sum Rupees")
            return Sum
        } else {
            println("Hashcart is empty")
        }
        return 0
    }

    fun applyDiscount(sum: Int,discountPrice:Double) {

        var discountedPrice = sum.let { let1 ->
            discountPrice.let { let2 ->
                let1 - (let1 * (let2 / 100))
            }
        }

        println("Discounted price is $discountedPrice")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val hashMap = mutableMapOf("Cake" to 12, "chips" to 23, "icecream" to 50, "pen" to 10, "books" to 100)
    println("----------------------------------------------------------")
    println("Items in shopping cart")
    println("----------------------------------------------------------")
    for (item in hashMap) {
        println(item)
    }
    val shoppingCart = ShoppingCart()
    val hashCart = mutableMapOf<String, Int>()

    shoppingCart.addItem(scanner, hashMap, hashCart)
    shoppingCart.removeItem(scanner, hashCart)
    var sum = 0
    sum = shoppingCart.calculatePrice(hashCart, sum)
    var discountPrice = 20.0
    shoppingCart.applyDiscount(sum,discountPrice)
}