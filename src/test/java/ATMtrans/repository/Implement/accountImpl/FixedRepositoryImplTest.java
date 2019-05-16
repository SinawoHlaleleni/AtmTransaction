package ATMtrans.repository.Implement.accountImpl;

import ATMtrans.domain.account.Fixed;
import ATMtrans.factory.factoryAccount.FixedFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FixedRepositoryImplTest {

    private FixedRepositoryImpl repository;
    private Fixed fixed;

    private Fixed getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.fixed= (Fixed) FixedRepositoryImpl.getRepository();
        this.fixed = FixedFactory.getAmount( 700 );
    }

    @Test
    public void d_getAll() {
        Set<Fixed> fixed = this.repository.getAll();
        System.out.println("In get all," + fixed);
    }

    @Test
    public void create() {
        Fixed created = this.repository.create(this.fixed);
        System.out.println("the create, done =" + created);
        Assert.assertNotNull(created);
        Assert.assertNotSame(created, this.fixed);
    }

    @Test
    public void update() {
        String newFixedId = "002345";
        Fixed updated = new Fixed.Builder().copy(getSaved()).Id(newFixedId).build();
        System.out.println("the update, done = " + updated );
        this.repository.update(updated);
        Assert.assertSame(newFixedId,updated.getId());
    }

    @Test
    public void delete() {
        Fixed saved = getSaved();
        this.repository.delete(saved.getId());
        d_getAll();
    }

    @Test
    public void read() {
        Fixed saved = getSaved();
        Fixed read = this.repository.read(saved.getId());
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