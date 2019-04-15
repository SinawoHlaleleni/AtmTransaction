package ATMtrans.factoryDomain;

import ATMtrans.domain.Withdrawal;
import org.junit.Assert;
import org.junit.Test;

public class WithdrawalFactoryTest {

    @Test
    public void getAmount() {

       Withdrawal s = WithdrawalFactory.getAmount(0.00);
        System.out.println(s);
        Assert.assertNotNull(s.getAmount());

    }
}