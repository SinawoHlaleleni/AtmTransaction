package ATMtrans.repository.Implement.accountImpl;

import ATMtrans.domain.account.Savings;
import ATMtrans.domain.account.Statement;
import ATMtrans.factory.factoryAccount.StatementFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StatementRepositoryImplTest {

    private StatementRepositoryImpl repository;
    private Statement statement;

    private Statement getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.statement= (Statement) StatementRepositoryImpl.getRepository();
        this.statement = StatementFactory.getType( "6 Months" );
    }

    @Test
    public void d_getAll() {
        Set<Statement> statements = this.repository.getAll();
        System.out.println("In get all," + statements);
    }

    @Test
    public void create() {
        Statement created = this.repository.create(this.statement);
        System.out.println("the create, done =" + created);
        Assert.assertNotNull(created);
        Assert.assertNotSame(created, this.statement);
    }

    @Test
    public void update() {
        String newStatemId = "002345";
        Statement updated = new Statement.Builder().copy(getSaved()).id(newStatemId).build();
        System.out.println("the update, done = " + updated );
        this.repository.update(updated);
        Assert.assertSame(newStatemId,updated.getId());
    }

    @Test
    public void delete() {
        Statement saved = getSaved();
        this.repository.delete(saved.getId());
        d_getAll();
    }

    @Test
    public void read() {
        Statement saved = getSaved();
        Statement read = this.repository.read(saved.getId());
        System.out.println("the read, read = " + read);
        Assert.assertSame(read,saved);
    }
}