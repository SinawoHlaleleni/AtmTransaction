package ATMtrans.repository.Implement.cardlessImpl;

import ATMtrans.domain.cardless.CardlessWithdrawal;
import ATMtrans.factory.factoryCardless.CardlessWithdrawalFactory;
import ATMtrans.repository.repositoryCardless.CardlessWithdrawalRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class CardlessWithdrawalRepositoryImplTest {

    private CardlessWithdrawalRepositoryImpl repository;
    private CardlessWithdrawal cardlessWithdrawal;
    private CardlessWithdrawal getSaved() {
        Set<CardlessWithdrawal> saved = this.repository.getAll();
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.cardlessWithdrawal= CardlessWithdrawalFactory.getAmount(1500);
    }

    @Test
    public void d_getAll() {

        Set<CardlessWithdrawal> all =this.repository.getAll();
        System.out.println("In getall,all = " + all);
    }

    @Test
    public void create() {

        CardlessWithdrawal created = this.repository.create(this.cardlessWithdrawal);
        System.out.println("the create, to be done =" + created);
        d_getAll();
        Assert.assertSame(created, this.cardlessWithdrawal);

    }

    @Test
    public void update() {

        String newUserName = "Unused user name";
        CardlessWithdrawal cardlessWithdrawal = new CardlessWithdrawal.Builder().copy(getSaved()).Id(newUserName).build();
        System.out.println("the updates,to be done = " + cardlessWithdrawal );
        CardlessWithdrawal updated= this.repository.update(cardlessWithdrawal);
        System.out.println("the updates, done = " + updated );
        Assert.assertSame(newUserName,updated.getId());
        d_getAll();

    }

    @Test
    public void delete() {

        CardlessWithdrawal saved = getSaved();
        this.repository.delete(saved.getId());
        d_getAll();

    }

    @Test
    public void read() {

        CardlessWithdrawal saved = getSaved();
        System.out.println("the read, done = " + saved.getId() );
        CardlessWithdrawal read = this.repository.read(saved.getId());
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