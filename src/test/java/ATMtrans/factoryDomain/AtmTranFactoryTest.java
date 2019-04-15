package ATMtrans.factoryDomain;

import ATMtrans.domain.AtmTran;
import org.junit.Assert;
import org.junit.Test;

public class AtmTranFactoryTest {

    @Test
    public void getAtmTran() {

        String type = "Statement";
        AtmTran a = AtmTranFactory.getAtmTran(type);
        System.out.println(a);
        Assert.assertNotNull(a.getTransId());
    }
}