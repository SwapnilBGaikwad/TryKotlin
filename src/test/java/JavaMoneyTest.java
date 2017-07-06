import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

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
        assertEquals( javaMoney1, javaMoney2 );
        assertEquals( new Integer( 20 ), javaMoney1.amount() );
        assertEquals( "$", javaMoney1.currency() );
    }
}