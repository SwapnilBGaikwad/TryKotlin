data class Money(val amount: Int, val currency: String)

fun javaMoney(money: Money?) {
    if (money != null) {
        println(money.amount)
    }
}

fun main(args: Array<String>) {
    javaMoney(Money(20, "$"))
    javaMoney(null)
}