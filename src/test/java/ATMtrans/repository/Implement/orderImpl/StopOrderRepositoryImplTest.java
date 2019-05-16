package ATMtrans.repository.Implement.orderImpl;

import ATMtrans.domain.orders.StopOrder;
import ATMtrans.factory.factoryOrders.StopOrderFactory;
import ATMtrans.repository.Implement.accountImpl.SavingRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StopOrderRepositoryImplTest {

    private StopOrderRepositoryImpl repository;
    private StopOrder cashLimit;

    private StopOrder getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository= (StopOrderRepositoryImpl) StopOrderRepositoryImpl.getRepository();
        this.cashLimit = StopOrderFactory.getAmount( 1000 );
    }
    @Test
    public void d_getAll() {
        Set<StopOrder> stopOrder = this.repository.getAll();
        System.out.println("In get all," + stopOrder);
    }

    @Test
    public void create() {
        StopOrder created = this.repository.create(this.cashLimit);
        System.out.println("the create, done =" + created);
        Assert.assertNotNull(created);
        Assert.assertNotSame(created, this.cashLimit);
    }

    @Test
    public void update() {
        String newCashLimiteId = "002345";
        StopOrder updated = new StopOrder.Builder().copy(getSaved()).Id(newCashLimiteId).build();
        System.out.println("the update, done = " + updated );
        this.repository.update(updated);
        Assert.assertSame(newCashLimiteId,updated.getId());
    }

    @Test
    public void delete() {
        StopOrder saved = getSaved();
        this.repository.delete(saved.getId());
        d_getAll();
    }

    @Test
    public void read() {
        StopOrder saved = getSaved();
        StopOrder read = this.repository.read(saved.getId());
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