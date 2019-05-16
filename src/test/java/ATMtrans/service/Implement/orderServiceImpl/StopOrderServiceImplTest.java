package ATMtrans.service.Implement.orderServiceImpl;

import ATMtrans.domain.orders.StopOrder;
import ATMtrans.factory.factoryOrders.StopOrderFactory;
import ATMtrans.repository.Implement.orderImpl.StopOrderRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public  class StopOrderServiceImplTest {

    private StopOrderRepositoryImpl repository;
    private StopOrder stopOrder;

    private StopOrder getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.stopOrder= StopOrderFactory.getAmount(50);
    }

    @Test
    public void getAll() {
        Set<StopOrder> stopOrder =this.repository.getAll();
        System.out.println("In getall,all = " + stopOrder);
    }

    @Test
    public void create() {
        StopOrder created = this.repository.create(this.stopOrder);
        System.out.println("the create, done =" + created);
        Assert.assertNotNull(created);
        Assert.assertNotSame(created, this.stopOrder);
    }

    @Test
    public void update() {

        String newBankName = "ABSAs";
        StopOrder updated = new StopOrder.Builder().copy(getSaved()).Id(newBankName).build();
        System.out.println("the update, done = " + updated );
        this.repository.update(updated);
        Assert.assertSame(newBankName,updated.getId());
    }

    @Test
    public void delete() {

        StopOrder saved = getSaved();
        this.repository.delete(saved.getId());
        getAll();
    }

    @Test
    public void read() {

        StopOrder saved = getSaved();
        StopOrder read = this.repository.read(saved.getId());
        System.out.println("the read, read = " + read);
        Assert.assertSame(read,saved);
    }
}