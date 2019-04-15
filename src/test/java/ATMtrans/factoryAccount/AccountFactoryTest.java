package ATMtrans.factoryAccount;

import ATMtrans.account.Account;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountFactoryTest {

    @Test
    public void getAccount() {

        String type = "...";
        Account a = AccountFactory.getAccount(type);
        System.out.println(a);
        Assert.assertNotNull(a.getAccId());
    }
}