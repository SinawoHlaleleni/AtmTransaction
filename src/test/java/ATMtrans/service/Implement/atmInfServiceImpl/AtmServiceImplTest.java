package ATMtrans.service.Implement.atmInfServiceImpl;

import ATMtrans.domain.atmInfor.Atm;
import ATMtrans.factory.factoryAtmInfor.AtmFactory;
import ATMtrans.repository.Implement.atmInforImpl.AtmRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AtmServiceImplTest {

    private AtmRepositoryImpl repository;
    private Atm atm;

    private Atm getSaved(){
        return this.repository.getAll().iterator().next();
    }
    @Before
    public  void setUp()throws Exception{
        this.repository= (AtmRepositoryImpl) AtmRepositoryImpl.getRepository();
        this.atm= AtmFactory.getType("ABSAS");
    }

    @Test
    public void d_getAll() {

        Set<Atm> atm =this.repository.getAll();
        System.out.println("In getall,all = " + atm);
    }

    @Test
    public void create() {
        Atm created = this.repository.create(this.atm);
        System.out.println("the create, done =" + created);
        Assert.assertNotNull(created);
        Assert.assertNotSame(created, this.atm);
    }

    @Test
    public void update() {
        String newAtmName = "ABSAs";
        Atm updated = new Atm.Builder().copy(getSaved()).Id(newAtmName).build();
        System.out.println("the update, done = " + updated );
        this.repository.update(updated);
        Assert.assertSame(newAtmName,updated.getId());
    }

    @Test
    public void delete() {
        Atm saved = getSaved();
        this.repository.delete(saved.getId());
        d_getAll();

    }

    @Test
    public void read() {
        Atm saved = getSaved();
        Atm read = this.repository.read(saved.getId());
        System.out.println("the read, read = " + read);
        Assert.assertSame(read,saved);

    }
}