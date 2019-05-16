package ATMtrans.repository.Implement.accountImpl;

import ATMtrans.domain.account.Check;
import ATMtrans.factory.factoryAccount.CheckFactory;
import ATMtrans.repository.repositoryAccount.CheckRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CheckRepositoryImplTest {

    private CheckRepositoryImpl repository;
    private Check check;

    private Check getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository= (CheckRepositoryImpl) CheckRepositoryImpl.getRepository();
        this.check = CheckFactory.getAmount( 500 );
    }

    @Test
    public void d_getAll() {
        Set<Check> check = this.repository.getAll();
        System.out.println("In get all," + check);
    }

    @Test
    public void create() {
        Check created = this.repository.create(this.check);
        System.out.println("the create, done =" + created);
        Assert.assertNotNull(created);
        Assert.assertNotSame(created, this.check);
    }

    @Test
    public void update() {
        String newChechId = "002345";
        Check updated = new Check.Builder().copy(getSaved()).Id(newChechId).build();
        System.out.println("the update, done = " + updated );
        this.repository.update(updated);
        Assert.assertSame(newChechId,updated.getId());
    }

    @Test
    public void delete() {
        Check saved = getSaved();
        this.repository.delete(saved.getId());
        d_getAll();
    }

    @Test
    public void read() {
        Check saved = getSaved();
        Check read = this.repository.read(saved.getId());
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