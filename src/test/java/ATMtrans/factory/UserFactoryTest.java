package ATMtrans.factory;

import ATMtrans.domain.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    @Test
    public void getUser() {


        String username = "SinawoHlaleleni";
        String password = "940825SZHN";
        User s = UserFactory.getUser(username,password);
        System.out.println(s);
        Assert.assertNotNull(s.getUserId());
    }
}