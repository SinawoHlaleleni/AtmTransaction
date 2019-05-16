package ATMtrans.repository.Implement.cardlessImpl;

import ATMtrans.domain.cardless.CardlessService;
import ATMtrans.factory.factoryCardless.CardlessServiceFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CardlessServiceRepositoryImplTest {

    private CardlessServiceRepositoryImpl repository;
    private CardlessService cardlessService;

    private CardlessService getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository= (CardlessServiceRepositoryImpl) CardlessServiceRepositoryImpl.getRepository();
        this.cardlessService = CardlessServiceFactory.getType( "..." );
    }
    @Test
    public void d_getAll() {
        Set<CardlessService> cashLimits = this.repository.getAll();
        System.out.println("In get all," + cashLimits);
    }

    @Test
    public void create() {
        CardlessService created = this.repository.create(this.cardlessService);
        System.out.println("the create, done =" + created);
        Assert.assertNotNull(created);
        Assert.assertNotSame(created, this.cardlessService);
    }

    @Test
    public void update() {
        String newCardlId = "002345";
        CardlessService updated = new CardlessService.Builder().copy(getSaved()).Id(newCardlId).build();
        System.out.println("the update, done = " + updated );
        this.repository.update(updated);
        Assert.assertSame(newCardlId,updated.getId());
    }

    @Test
    public void delete() {
        CardlessService saved = getSaved();
        this.repository.delete(saved.getId());
        d_getAll();
    }

    @Test
    public void read() {
        CardlessService saved = getSaved();
        CardlessService read = this.repository.read(saved.getId());
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