package ATMtrans.repository.Implement.accountImpl;

import ATMtrans.domain.account.Savings;
import ATMtrans.factory.factoryAccount.SavingsFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SavingRepositoryImplTest {

    private SavingRepositoryImpl repository;
    private Savings savings;

    private Savings getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository= SavingRepositoryImpl.getRepository();
        this.savings = SavingsFactory.getAmount( 500 );
    }

    @Test
    public void d_getAll() {
        Set<Savings> savings = this.repository.getAll();
        System.out.println("In get all," + savings);
    }

    @Test
    public void create() {
        Savings created = this.repository.create(this.savings);
        System.out.println("the create, done =" + created);
        Assert.assertNotNull(created);
        Assert.assertNotSame(created, this.savings);
    }

    @Test
    public void update() {
        String newSavingId = "002345";
        Savings updated = new Savings.Builder().copy(getSaved()).Id(newSavingId).build();
        System.out.println("the update, done = " + updated );
        this.repository.update(updated);
        Assert.assertSame(newSavingId,updated.getId());
    }

    @Test
    public void delete() {
        Savings saved = getSaved();
        this.repository.delete(saved.getId());
        d_getAll();
    }

    @Test
    public void read() {
        Savings saved = getSaved();
        Savings read = this.repository.read(saved.getId());
        System.out.println("the read, read = " + read);
        Assert.assertSame(read,saved);
    }

    @Test
    public void delete1() {
    }

    @Test
    public void read1() {
    }
}