package ATMtrans.repository.Implement.bankInforImpl;

import ATMtrans.domain.bankInfor.Branch;
import ATMtrans.factory.factoryBankInfor.BranchFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class BranchRepositoryImplTest {

    private BranchRepositoryImpl repository;
    private Branch branch;
    private Branch getSaved() {
        Set<Branch> saved = this.repository.getAll();
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.branch= BranchFactory.getName("Cnr cpt Absa");
    }

    @Test
    public void d_getAll() {
        Set<Branch> all =this.repository.getAll();
        System.out.println("In getall,all = " + all);
    }

    @Test
    public void create() {

        Branch created = this.repository.create(this.branch);
        System.out.println("the create, to be done =" + created);
        d_getAll();
        Assert.assertSame(created, this.branch);

    }

    @Test
    public void update() {

        String newUserName = "Unused user name";
        Branch branch = new Branch.Builder().copy(getSaved()).Id(newUserName).build();
        System.out.println("the updates,to be done = " + branch );
        Branch updated= this.repository.update(branch);
        System.out.println("the updates, done = " + updated );
        Assert.assertSame(newUserName,updated.getId());
        d_getAll();

    }

    @Test
    public void delete() {
        Branch saved = getSaved();
        this.repository.delete(saved.getId());
        d_getAll();

    }

    @Test
    public void read() {

        Branch saved = getSaved();
        System.out.println("the read, done = " + saved.getId() );
        Branch read = this.repository.read(saved.getId());
        System.out.println("the read, read = " + read);
        d_getAll();
        Assert.assertEquals(saved,read);

    }
}