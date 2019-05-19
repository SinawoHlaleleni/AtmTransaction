package ATMtrans.repository.Implement.atmTransiesImpl;

import ATMtrans.domain.atmTransies.Balance;
import ATMtrans.factory.factoryAtmTransies.BalanceFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class BalanceRepositoryImplTest {

    private BalanceRepositoryImpl repository;
    private Balance balance;
    private Balance getSaved() {
        Set<Balance> saved = this.repository.getAll();
        return this.repository.getAll().iterator().next();
    }
    @Before
    public void setUp() throws Exception {
        this.balance= BalanceFactory.getAmount(1500);
        }

    @Test
    public void d_getAll() {
        Set<Balance> all =this.repository.getAll();
        System.out.println("In getall,all = " + all);
    }

    @Test
    public void create() {

        Balance created = this.repository.create(this.balance);
        System.out.println("the create, to be done =" + created);
        d_getAll();
        Assert.assertSame(created, this.balance);
    }

    @Test
    public void update() {

        String newUserName = "Unused user name";
        Balance balance = new Balance.Builder().copy(getSaved()).Id(newUserName).build();
        System.out.println("the updates,to be done = " + balance );
        Balance updated= this.repository.update(balance);
        System.out.println("the updates, done = " + updated );
        Assert.assertSame(newUserName,updated.getId());
        d_getAll();
    }
    @Test
    public void delete() {

        Balance saved = getSaved();
        this.repository.delete(saved.getId());
        d_getAll();
    }
    @Test
    public void read() {

        Balance saved = getSaved();
        System.out.println("the read, done = " + saved.getId() );
        Balance read = this.repository.read(saved.getId());
        System.out.println("the read, read = " + read);
        d_getAll();
        Assert.assertEquals(saved,read);
    }
    @Test
    public void delete1() {
    }

    @Test
    public void read1() {
    }
}