package ATMtrans.factoryAccount;

import ATMtrans.account.Statement;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StatementFactoryTest {

    @Test
    public void getAccount() {
        String type = "...";
        Statement a = StatementFactory.getAccount(type);
        System.out.println(a);
        Assert.assertNotNull(a.getId());

    }
}