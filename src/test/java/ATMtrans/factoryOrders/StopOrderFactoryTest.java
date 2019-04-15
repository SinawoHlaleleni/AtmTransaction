package ATMtrans.factoryOrders;

import ATMtrans.orders.StopOrder;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StopOrderFactoryTest {

    @Test
    public void getAmount() {

        StopOrder s = StopOrderFactory.getAmount(0.00);
        System.out.println(s);
        Assert.assertNotNull(s.getAmount());
    }
}