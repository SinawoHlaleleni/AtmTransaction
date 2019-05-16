package ATMtrans.repository.Implement.accountImpl;

import ATMtrans.domain.account.Flexible;
import ATMtrans.factory.factoryAccount.FlexibleFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class FlexibleRepositoryImplTest {

    private FlexibleRepositoryImpl repository;
    private Flexible flexible;

    private Flexible getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.flexible = (Flexible) FlexibleRepositoryImpl.getRepository();
        this.flexible = FlexibleFactory.getAmount( 800 );
    }

    @Test
    public void d_getAll() {
        Set<Flexible> flexible = this.repository.getAll();
        System.out.println("In get all," + flexible);
    }

    @Test
    public void create() {
        Flexible created = this.repository.create(this.flexible);
        System.out.println("the create, done =" + created);
        Assert.assertNotNull(created);
        Assert.assertNotSame(created, this.flexible);
    }

    @Test
    public void update() {
        String newFlexibleId = "002345";
        Flexible updated = new Flexible.Builder().copy(getSaved()).Id(newFlexibleId).build();
        System.out.println("the update, done = " + updated );
        this.repository.update(updated);
        Assert.assertSame(newFlexibleId,updated.getId());
    }

    @Test
    public void delete() {
        Flexible saved = getSaved();
        this.repository.delete(saved.getId());
        d_getAll();
    }

    @Test
    public void read() {
        Flexible saved = getSaved();
        Flexible read = this.repository.read(saved.getId());
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