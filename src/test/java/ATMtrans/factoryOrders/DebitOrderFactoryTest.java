package ATMtrans.factoryOrders;

import ATMtrans.orders.DebitOrders;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DebitOrderFactoryTest {

    @Test
    public void getDebitOrders() {

        String type = "...";
        DebitOrders a = DebitOrderFactory.getDebitOrders(type);
        System.out.println(a);
        Assert.assertNotNull(a.getId());
    }
}