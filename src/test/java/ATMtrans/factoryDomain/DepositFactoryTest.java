package ATMtrans.factoryDomain;

import ATMtrans.domain.atmTransies.Deposit;
import ATMtrans.factoryDomain.factoryAtmTransies.DepositFactory;
import org.junit.Assert;
import org.junit.Test;

public class DepositFactoryTest {

    @Test
    public void getAmount() {
        Deposit s = DepositFactory.getAmount(100.00);
        System.out.println(s);
        Assert.assertNotNull(s.getAmount());

    }
}