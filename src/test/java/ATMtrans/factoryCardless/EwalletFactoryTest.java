package ATMtrans.factoryCardless;

import ATMtrans.cardless.Ewallet;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EwalletFactoryTest {

    @Test
    public void getAmount() {

        Ewallet s = EwalletFactory.getAmount(500.00);
        System.out.println(s);
        Assert.assertNotNull(s.getAmount());
    }
}