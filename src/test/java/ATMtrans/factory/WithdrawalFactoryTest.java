package ATMtrans.factory;

import ATMtrans.domain.Withdrawal;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WithdrawalFactoryTest {

    @Test
    public void getAmount() {

       Withdrawal s = WithdrawalFactory.getAmount(0.00);
        System.out.println(s);
        Assert.assertNotNull(s.getAmount());

    }
}