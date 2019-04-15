package ATMtrans.factoryAtmInfor;

import ATMtrans.atmInfor.CashLimit;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashLimitFactoryTest {

    @Test
    public void getAmount() {

        CashLimit s = CashLimitFactory.getAmount(0.00);
        System.out.println(s);
        Assert.assertNotNull(s.getId());

    }
}