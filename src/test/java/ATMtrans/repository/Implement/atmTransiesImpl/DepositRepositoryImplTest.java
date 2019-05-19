package ATMtrans.repository.Implement.atmTransiesImpl;

import ATMtrans.domain.atmTransies.Deposit;
import ATMtrans.factory.factoryAtmTransies.DepositFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class DepositRepositoryImplTest {

    private DepositRepositoryImpl repository;
    private Deposit deposit;

    private Deposit getSaved() {

        Set<Deposit> saved = this.repository.getAll();
        return this.repository.getAll().iterator().next();

    }
    @Before
    public void setUp() throws Exception {

        this.deposit= DepositFactory.getAmount(1500);
    }

    @Test
    public void d_getAll() {

        Set<Deposit> all =this.repository.getAll();
        System.out.println("In getall,all = " + all);
    }

    @Test
    public void create() {
        Deposit created = this.repository.create(this.deposit);
        System.out.println("the create, to be done =" + created);
        d_getAll();
        Assert.assertSame(created, this.deposit);

    }

    @Test
    public void update() {

        String newUserName = "Unused user name";
        Deposit deposit = new Deposit.Builder().copy(getSaved()).Id(newUserName).build();
        System.out.println("the updates,to be done = " + deposit );
        Deposit updated= this.repository.update(deposit);
        System.out.println("the updates, done = " + updated );
        Assert.assertSame(newUserName,updated.getId());
        d_getAll();
    }

    @Test
    public void delete() {
        Deposit saved = getSaved();
        this.repository.delete(saved.getId());
        d_getAll();
    }

    @Test
    public void read() {

        Deposit saved = getSaved();
        System.out.println("the read, done = " + saved.getId() );
        Deposit read = this.repository.read(saved.getId());
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