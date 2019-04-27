package ATMtrans.factoryDomain;

import ATMtrans.domain.atmTransies.Withdrawal;
import ATMtrans.factoryDomain.factoryAtmTransies.WithdrawalFactory;
import org.junit.Assert;
import org.junit.Test;

public class WithdrawalFactoryTest {

    @Test
    public void getAmount() {

       Withdrawal s = WithdrawalFactory.getAmount(50.00);
        System.out.println(s);
        Assert.assertNotNull(s.getAmount());

    }
}