package ATMtrans.service.Implement.atmTransiesServiceImpl;

import ATMtrans.domain.atmTransies.User;
import ATMtrans.factory.factoryAtmTransies.UserFactory;
import ATMtrans.repository.Implement.atmTransiesImpl.UserRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserServiceImplTest {

    private UserRepositoryImpl repository;
    private User user;

    private User getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.user= UserFactory.getUser("Sinawo", "000458g");
    }

    @Test
    public void getAll() {
        Set<User> user =this.repository.getAll();
        System.out.println("In getall,all = " + user);
    }

    @Test
    public void create() {
        User created = this.repository.create(this.user);
        System.out.println("the create, done =" + created);
        Assert.assertNotNull(created);
        Assert.assertNotSame(created, this.user);
    }

    @Test
    public void update() {
        String newUserName = "ABSAs";
        User updated = new User.Builder().copy(getSaved()).userId(newUserName).build();
        System.out.println("the update, done = " + updated );
        this.repository.update(updated);
        Assert.assertSame(newUserName,updated.getUserId());
    }

    @Test
    public void delete() {
        User saved = getSaved();
        this.repository.delete(saved.getUserId());
        getAll();

    }

    @Test
    public void read() {

        User saved = getSaved();
        User read = this.repository.read(saved.getUserId());
        System.out.println("the read, read = " + read);
        Assert.assertSame(read,saved);
    }
}