package ATMtrans.factoryOrders;

import ATMtrans.orders.CreditOrder;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreditOrderFactoryTest {

    @Test
    public void getAmount() {

        CreditOrder s = CreditOrderFactory.getAmount(10.00);
        System.out.println(s);
        Assert.assertNotNull(s.getAmount());
    }
}