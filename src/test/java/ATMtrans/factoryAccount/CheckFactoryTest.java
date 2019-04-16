package ATMtrans.factoryAccount;

import ATMtrans.account.Check;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckFactoryTest {

    @Test
    public void getAmount() {
        Check s = CheckFactory.getAmount(300.00);
        System.out.println(s);
        Assert.assertNotNull(s.getAmount());
    }
}