package ATMtrans.factoryAccount;

import ATMtrans.account.Fixed;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FixedFactoryTest {

    @Test
    public void getAmount() {

        Fixed s = FixedFactory.getAmount(0.00);
        System.out.println(s);
        Assert.assertNotNull(s.getAmount());
    }
}