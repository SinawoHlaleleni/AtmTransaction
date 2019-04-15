package ATMtrans.factoryAtmInfor;

import ATMtrans.atmInfor.Airtime;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AirtimeFactoryTest {

    @Test
    public void getAmount() {

        Airtime s = AirtimeFactory.getAmount(0.00);
        System.out.println(s);
        Assert.assertNotNull(s.gettAmount());
    }
}