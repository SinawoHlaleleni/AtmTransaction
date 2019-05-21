package ATMtrans.repository.Implement.atmTransiesImpl;

import ATMtrans.domain.atmInfor.Atm;
import ATMtrans.factory.factoryAtmInfor.AtmFactory;
import ATMtrans.repository.Implement.atmInforImpl.AtmRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class AtmTranRepositoryImplTest {

   /* private AtmRepositoryImpl repository;
    private Atm atmTr;
    /*private Atm getSaved()
    {
        Set<Atm> saved = this.repository.getAll();
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository= AtmTranRepositoryImpl.getRepository();
        this.atmTr= AtmFactory.getType("ABSA");
    }

    @Test
    public void d_getAll() {
        Set<Atm> all =this.repository.getAll();
        System.out.println("In getall,all = " + all);
    }

    @Test
    public void create() {

        Atm created = this.repository.create(this.atmTr);
        System.out.println("the create, to be done =" + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.atmTr);
    }

    @Test
    public void update() {

        String newUserName = "Unused user name";
        Atm atm = new Atm.Builder().Id(newUserName).build();
        System.out.println("the updates,to be done = " + atm );
        Atm updated= this.repository.update(atm);
        System.out.println("the updates, done = " + updated );
        Assert.assertEquals(newUserName,updated.getId());
        d_getAll();

    }

    @Test
    public void delete() {

        this.repository.delete(atmTr.getId());
        d_getAll();
    }

    @Test
    public void read() {
        System.out.println("the read, done = " + atmTr.getId() );
        Atm read = this.repository.read(atmTr.getId());
        System.out.println("the read, read = " + read);
        d_getAll();
        assertNotSame(atmTr,read);
    }*/
}