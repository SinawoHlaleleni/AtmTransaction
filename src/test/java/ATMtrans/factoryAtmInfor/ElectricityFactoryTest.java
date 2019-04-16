package ATMtrans.factoryAtmInfor;

import ATMtrans.atmInfor.Electricity;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectricityFactoryTest {

    @Test
    public void getAmount() {
        Electricity s = ElectricityFactory.getAmount(30.00);
        System.out.println(s);
        Assert.assertNotNull(s.getAmount());

    }
}