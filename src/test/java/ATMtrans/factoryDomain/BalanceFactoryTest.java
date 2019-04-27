package ATMtrans.factoryDomain;

import ATMtrans.domain.atmTransies.Balance;
import ATMtrans.factoryDomain.factoryAtmTransies.BalanceFactory;
import org.junit.Assert;
import org.junit.Test;

public class BalanceFactoryTest {

    @Test
    public void getAmount() {

       Balance s = BalanceFactory.getAmount(5000.00);
        System.out.println(s);
        Assert.assertNotNull(s.getAmount());
    }
    }
