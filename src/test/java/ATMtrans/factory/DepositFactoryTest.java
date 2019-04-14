package ATMtrans.factory;

import ATMtrans.domain.Deposit;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DepositFactoryTest {

    @Test
    public void getAmount() {
        Deposit s = DepositFactory.getAmount(0.00);
        System.out.println(s);
        Assert.assertNotNull(s.getAmount());

    }
}