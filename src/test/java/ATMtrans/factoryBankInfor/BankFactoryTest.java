package ATMtrans.factoryBankInfor;

import ATMtrans.bankInfor.Bank;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankFactoryTest {

    @Test
    public void getName() {

        Bank s = BankFactory.getName("ABSA");
        System.out.println(s);
        Assert.assertNotNull(s.getName());
    }
}