package ATMtrans.repository.Implement.atmTransiesImpl;

import ATMtrans.domain.atmTransies.Withdrawal;
import ATMtrans.factory.factoryAtmTransies.WithdrawalFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class WithdrawalRepositoryImplTest {

    private WithdrawalRepositoryImpl repository;
    private Withdrawal withdrawal;
    private Withdrawal getSaved() {
        Set<Withdrawal> saved = this.repository.getAll();
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.withdrawal= WithdrawalFactory.getAmount(1500);
    }

    @Test
    public void d_getAll() {
        Set<Withdrawal> all =this.repository.getAll();
        System.out.println("In getall,all = " + all);
    }

    @Test
    public void create() {
        Withdrawal created = this.repository.create(this.withdrawal);
        System.out.println("the create, to be done =" + created);
        d_getAll();
        Assert.assertSame(created, this.withdrawal);
    }

    @Test
    public void update() {

        String newUserName = "Unused user name";
        Withdrawal withdrawal = new Withdrawal.Builder().copy(getSaved()).Id(newUserName).build();
        System.out.println("the updates,to be done = " + withdrawal );
        Withdrawal updated= this.repository.update(withdrawal);
        System.out.println("the updates, done = " + updated );
        Assert.assertSame(newUserName,updated.getId());
        d_getAll();
    }

    @Test
    public void delete() {

        Withdrawal saved = getSaved();
        this.repository.delete(saved.getId());
        d_getAll();
    }

    @Test
    public void read() {

        Withdrawal saved = getSaved();
        System.out.println("the read, done = " + saved.getId() );
        Withdrawal read = this.repository.read(saved.getId());
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