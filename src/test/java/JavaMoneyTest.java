import org.junit.Assert;
import org.junit.Test;

public class JavaMoneyTest {
    @Test
    public void returns_true_if_money_amount_and_currency_is_same() {
        final JavaMoney javaMoney1 = new JavaMoney( 100, "$" );
        final JavaMoney javaMoney2 = new JavaMoney( 100, "$" );
        Assert.assertEquals( javaMoney1, javaMoney2 );
    }
}