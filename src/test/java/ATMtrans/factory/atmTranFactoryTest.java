package ATMtrans.factory;

import ATMtrans.domain.atmTran;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class atmTranFactoryTest {

    @Test
    public void getAtmTran() {

        String type = "Statement";
        atmTran a = atmTranFactory.getAtmTran(type);
        System.out.println(a);
        Assert.assertNotNull(a.getTransId());
    }
}