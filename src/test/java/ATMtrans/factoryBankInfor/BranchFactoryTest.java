package ATMtrans.factoryBankInfor;

import ATMtrans.bankInfor.Branch;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BranchFactoryTest {

    @Test
    public void getName() {
        Branch s = BranchFactory.getName("CNR ABSA branch");
        System.out.println(s);
        Assert.assertNotNull(s.getName());

    }
}