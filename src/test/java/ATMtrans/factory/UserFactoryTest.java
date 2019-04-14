package ATMtrans.factory;

import ATMtrans.domain.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    @Test
    public void getUser() {


        String Fname = "Sinawo";
        String Lname = "Hlaleleni";
        User s = UserFactory.getUser(Fname,Lname);
        System.out.println(s);
        Assert.assertNotNull(s.getUserId());
    }
}