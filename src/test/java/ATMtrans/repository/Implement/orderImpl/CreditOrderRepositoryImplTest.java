package ATMtrans.repository.Implement.orderImpl;

import ATMtrans.domain.orders.CreditOrder;
import ATMtrans.factory.factoryOrders.CreditOrderFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class CreditOrderRepositoryImplTest {

    private CreditOrderRepositoryImpl repository;
    private CreditOrder creditOrder;
    private CreditOrder getSaved() {
        Set<CreditOrder> saved = this.repository.getAll();
        return this.repository.getAll().iterator().next();

    }
    @Before
    public void setUp() throws Exception {

        this.creditOrder= CreditOrderFactory.getAmount(1200);

    }

    @Test
    public void d_getAll() {
        Set<CreditOrder> all =this.repository.getAll();
        System.out.println("In getall,all = " + all);

    }

    @Test
    public void create() {

        CreditOrder created = this.repository.create(this.creditOrder);
        System.out.println("the create, to be done =" + created);
        d_getAll();
        Assert.assertSame(created, this.creditOrder);
    }

    @Test
    public void update() {
        String newUserName = "Unused user name";
        CreditOrder branch = new CreditOrder.Builder().copy(getSaved()).Id(newUserName).build();
        System.out.println("the updates,to be done = " + branch );
        CreditOrder updated= this.repository.update(branch);
        System.out.println("the updates, done = " + updated );
        Assert.assertSame(newUserName,updated.getId());
        d_getAll();

    }

    @Test
    public void delete() {
        CreditOrder saved = getSaved();
        this.repository.delete(saved.getId());
        d_getAll();

    }

    @Test
    public void read() {
        CreditOrder saved = getSaved();
        System.out.println("the read, done = " + saved.getId() );
        CreditOrder read = this.repository.read(saved.getId());
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