package ATMtrans.factoryAtmInfor;

import ATMtrans.atmInfor.CashTransfer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashTransferFactoryTest {

    @Test
    public void getAmount() {
        CashTransfer s = CashTransferFactory.getAmount(0.00);
        System.out.println(s);
        Assert.assertNotNull(s.getAmount());
    }
    }
