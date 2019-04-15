package ATMtrans.factoryCardless;

import ATMtrans.cardless.CardlessWithdrawal;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardlessWithdrawalFactoryTest {

    @Test
    public void getAmount() {

        CardlessWithdrawal s = CardlessWithdrawalFactory.getAmount(0.00);
        System.out.println(s);
        Assert.assertNotNull(s.getAmount());
    }
}