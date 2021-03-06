package ATMtrans.service.Implement.accountServiceImpl;

import ATMtrans.domain.account.Flexible;
import ATMtrans.factory.factoryAccount.FlexibleFactory;
import ATMtrans.repository.Implement.accountImpl.FlexibleRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FlexibleServiceImplTest {

    private FlexibleRepositoryImpl repository;
    private Flexible flexible;

    @Before
    public void setUp() throws Exception {
        this.repository = (FlexibleRepositoryImpl) FlexibleRepositoryImpl.getRepository();
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
        Assert.assertSame(created, this.flexible);
    }

    @Test
    public void update() {
        String newFlexibleId = "002345";
        Flexible updated = new Flexible.Builder().Id(newFlexibleId).build();
        System.out.println("the update, done = " + updated );
        this.repository.update(updated);
        Assert.assertEquals(newFlexibleId,updated.getId());
        d_getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(flexible.getId());
        d_getAll();
    }

    @Test
    public void read() {
        Flexible read = this.repository.read(flexible.getId());
        System.out.println("the read, read = " + read);
        d_getAll();
        assertNotSame(read,flexible);
    }


    @Test
    public void delete1() {
    }

    @Test
    public void read1() {
    }
}