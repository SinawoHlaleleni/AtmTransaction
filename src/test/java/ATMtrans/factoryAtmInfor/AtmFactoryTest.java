package ATMtrans.factoryAtmInfor;

import ATMtrans.atmInfor.Atm;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AtmFactoryTest {

    @Test
    public void getType() {

        Atm s = AtmFactory.getType("...");
        System.out.println(s);
        Assert.assertNotNull(s.getType());
    }
}