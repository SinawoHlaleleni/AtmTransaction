package ATMtrans.repository.repositoryAtmTransies;

import ATMtrans.domain.atmTransies.User;
import ATMtrans.factory.factoryAtmTransies.UserFactory;
import ATMtrans.repository.Implement.atmTransiesImpl.UserRepositoryImpl;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRepositoryTest {
   String userName;
    String passWord;
    UserRepository userR;

    @Before
    public void setUp() throws Exception {
        userR = UserRepositoryImpl.getRepository();
        userName=("Sinawo");
        passWord=("snw2017");
    }

   @Test
    public  void create() throws Exception{

       User user = UserFactory.getUser(userName,passWord);
       userR.create(user);
       assertEquals("Sinawo",user.getUserName());
   }

   @Test//(dependsOnMethods = "create")
    public void read()throws Exception{
        User readUser = userR.read(userName);
        assertEquals("Sinawo",readUser.getUserName());

   }
   @Test
    public void Update()throws Exception{
        User user = userR.read(userName);
        User newUser = new User.Builder()
                .userName(user.getUserName())
                .userName(user.getUserPassword())
                .build();
        userR.update(newUser);
        User UpdateUser = userR.read(userName);
        assertEquals("Nitta",UpdateUser.getUserName());

   }
   @Test
    public void delete() throws Exception{
        userR.delete(userName);
        User user = userR.read(userName);
        assertNull(user);
   }


}