package ATMtrans.factoryDomain.factoryAccount;

import ATMtrans.domain.account.Statement;
import org.junit.Assert;
import org.junit.Test;

public class StatementFactoryTest {

    @Test
    public void getAccount() {
        String type = "Monthly";
        Statement a = StatementFactory.getAccount(type);
        System.out.println(a);
        Assert.assertNotNull(a.getId());

    }
}