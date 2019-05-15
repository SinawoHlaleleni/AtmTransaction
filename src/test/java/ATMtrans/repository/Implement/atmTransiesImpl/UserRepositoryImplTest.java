package ATMtrans.repository.Implement.atmTransiesImpl;

import ATMtrans.domain.atmTransies.User;
import ATMtrans.factory.factoryAtmTransies.UserFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserRepositoryImplTest {

    private UserRepositoryImpl repository;
    private User user;
    private User getSaved(){
        Set<User>saved = this.repository.getAll();
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.user= UserFactory.getUser("Sinawo", "000458g");
    }

    @Test
    public void d_getAll() {
        Set<User> all =this.repository.getAll();
        System.out.println("In getall,all = " + all);
    }

    @Test
    public void create() {
        User created = this.repository.create(this.user);
        System.out.println("the create, to be done =" + created);
        d_getAll();
        Assert.assertSame(created, this.user);
    }

    @Test
    public void update() {
        String newUserName = "Unused user name";
        User user = new User.Builder().copy(getSaved()).userId(newUserName).build();
        System.out.println("the updates,to be done = " + user );
        User updated= this.repository.update(user);
        System.out.println("the updates, done = " + updated );
        Assert.assertSame(newUserName,updated.getUserId());
        d_getAll();
    }

    @Test
    public void delete() {
        User saved = getSaved();
        this.repository.delete(saved.getUserId());
        d_getAll();

    }

    @Test
    public void read() {

        User saved = getSaved();
        System.out.println("the read, done = " + saved.getUserId() );
        User read = this.repository.read(saved.getUserId());
        System.out.println("the read, read = " + read);
        d_getAll();
        Assert.assertEquals(saved,read);
    }
}