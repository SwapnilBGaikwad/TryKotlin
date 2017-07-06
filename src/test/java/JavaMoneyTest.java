import org.junit.Assert;
import org.junit.Test;

public class JavaMoneyTest {
    @Test
    public void returns_true_if_money_amount_and_currency_is_same() {
        final JavaMoney javaMoney1 = JavaMoney.builder()
                .setAmount( 20 )
                .setCurrency( "$" )
                .build();
        final JavaMoney javaMoney2 = JavaMoney.builder()
                .setAmount( 20 )
                .setCurrency( "$" )
                .build();
        Assert.assertEquals( javaMoney1, javaMoney2 );
//        Assert.assertEquals( 20 , javaMoney1.setAmount() );
    }
}