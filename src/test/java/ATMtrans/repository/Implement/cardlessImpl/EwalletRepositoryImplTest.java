package ATMtrans.repository.Implement.cardlessImpl;

import ATMtrans.domain.cardless.Ewallet;
import ATMtrans.factory.factoryCardless.EwalletFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EwalletRepositoryImplTest {

    private EwalletRepositoryImpl repository;
    private Ewallet ewallet;

    private Ewallet getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository= (EwalletRepositoryImpl) EwalletRepositoryImpl.getRepository();
        this.ewallet = EwalletFactory.getAmount( 1000 );
    }
    @Test
    public void d_getAll() {
        Set<Ewallet> ewallet = this.repository.getAll();
        System.out.println("In get all," + ewallet);
    }

    @Test
    public void create() {
        Ewallet created = this.repository.create(this.ewallet);
        System.out.println("the create, done =" + created);
        Assert.assertNotNull(created);
        Assert.assertNotSame(created, this.ewallet);
    }

    @Test
    public void update() {
        String newCashLimiteId = "002345";
        Ewallet updated = new Ewallet.Builder().copy(getSaved()).Id(newCashLimiteId).build();
        System.out.println("the update, done = " + updated );
        this.repository.update(updated);
        Assert.assertSame(newCashLimiteId,updated.getId());
    }

    @Test
    public void delete() {
        Ewallet saved = getSaved();
        this.repository.delete(saved.getId());
        d_getAll();
    }

    @Test
    public void read() {
        Ewallet saved = getSaved();
        Ewallet read = this.repository.read(saved.getId());
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