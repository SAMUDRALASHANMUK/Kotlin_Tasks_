import java.util.Scanner

sealed class BankAccount {
    class SavingsAccount(var accountNumber: Long, var balance: Long) : BankAccount()


    class CurrentAccount(var accountNumber: Long, var balance: Long) : BankAccount()

    class FixedDepositAccount(var accountNumber: Long, var balance: Long) : BankAccount()

}

fun depositFunds(bankAccount: BankAccount, amount: Long): Unit {
    when (bankAccount) {
        is BankAccount.SavingsAccount -> {
            var balance: Long = if (amount > 0) {
                println("Amount deposited successfully !! ")
                amount + bankAccount.balance
            } else {
                println("Unable to deposit the negative amount")
                bankAccount.balance
            }
            println("Your current balance is $balance")

        }

        is BankAccount.CurrentAccount -> {
            var balance: Long = if (amount > 0) {
                println("Amount deposited successfully !! ")
                amount + bankAccount.balance
            } else {
                println("Unable to deposit the negative amount")
                bankAccount.balance
            }
            println("Your current balance is $balance")
        }

        is BankAccount.FixedDepositAccount -> {
            var balance: Long = if (amount > 0) {
                println("Amount deposited successfully !! ")
                amount + bankAccount.balance
            } else {
                println("Unable to deposit the negative amount")
                bankAccount.balance
            }
            println("Your current balance is $balance")
        }
    }
}

fun withdrawFunds(bankAccount: BankAccount, amount: Long) {
    when (bankAccount) {
        is BankAccount.SavingsAccount -> {
            var balance: Long = if (amount > 0 && bankAccount.balance >= amount) {
                println("Amount withdrawn successfully !! ")
                bankAccount.balance - amount
            } else {
                println("Unable to withdrawn the negative amount !! ")
                bankAccount.balance
            }
            println("Your current balance is $balance")
        }

        is BankAccount.CurrentAccount -> {
            var balance: Long = if (amount > 0 && bankAccount.balance >= amount) {
                println("Amount withdrawn successfully !! ")
                bankAccount.balance - amount
            } else {
                println("Unable to withdrawn the negative amount !! ")
                bankAccount.balance
            }
            println("Your current balance is $balance")
        }

        is BankAccount.FixedDepositAccount -> {
            var balance: Long = if (amount > 0 && bankAccount.balance >= amount) {
                println("Amount withdrawn successfully !! ")
                bankAccount.balance - amount
            } else {
                println("Unable to withdrawn the negative amount !! ")
                bankAccount.balance
            }
            println("Your current balance is $balance")
        }
    }
}


fun main() {
        var scanner = Scanner(System.`in`)
        println("Enter the operation which you are going to perform  1.Withdraw 2.Deposit")
        var type = scanner.nextInt()

    if (type == 1) {
        inputs(scanner, "withdraw")
    } else if (type == 2) {
        inputs(scanner, "deposit")
    } else {
        println("Unable to process your request due to unavailable input")
    }
}

fun inputs(scanner: Scanner, operations: String) {

    var accountType: String = """
        Enter your account type
             1 . SavingsAccount
             2 . CurrentAccount
             3 . FixedDepositAccount
    """.trimIndent()
    println(accountType)
    var choose = scanner.nextInt()

    println("Enter the amount")
    var amount = scanner.nextLong()

    val bankAccount = when (choose) {
        1 -> BankAccount.SavingsAccount(1, 1000)
        2 -> BankAccount.CurrentAccount(2, 2000)
        3 -> BankAccount.FixedDepositAccount(3, 3000)
        else -> {
            println("Wrong account type found unable to process your request.....!")
            return
        }
    }
    if (operations == "withdraw") {
        withdrawFunds(bankAccount, amount)
    } else if (operations == "deposit") {
        depositFunds(bankAccount, amount)
    } else {
        println("Your request not found")
        return
    }
}
