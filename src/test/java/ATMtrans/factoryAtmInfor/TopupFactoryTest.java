package ATMtrans.factoryAtmInfor;

import ATMtrans.atmInfor.Topup;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TopupFactoryTest {

    @Test
    public void getType() {

        Topup s = TopupFactory.getType("SMS");
        System.out.println(s);
        Assert.assertNotNull(s.getType());
    }
}