package ATMtrans.factoryDomain;

import ATMtrans.domain.User;
import org.junit.Assert;
import org.junit.Test;

public class UserFactoryTest {

    @Test
    public void getUser() {


        String username = "SinawoHlaleleni";
        String password = "12345SZHN";
        User s = UserFactory.getUser(username,password);
        System.out.println(s);
        Assert.assertNotNull(s.getUserId());
    }
}