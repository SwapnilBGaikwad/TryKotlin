import org.junit.Assert
import org.junit.Test

class MoneyTest {
    @Test
    fun returns_true_if_money_amount_and_currency_is_same() {
        val money1 = Money(100, "$")
        val money2 = Money(100, "$")
        Assert.assertEquals(money1, money2)
    }
}