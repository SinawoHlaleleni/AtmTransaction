package ATMtrans.service.Implement.bankServiceImpl;

import ATMtrans.domain.bankInfor.Bank;
import ATMtrans.factory.factoryBankInfor.BankFactory;
import ATMtrans.repository.Implement.bankInforImpl.BankRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BankServiceImplTest {

    private BankRepositoryImpl repository;
    private Bank bank;

    private Bank getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.bank= BankFactory.getName("ABSAS");
    }

    @Test
    public void getAll() {
        Set<Bank> bank =this.repository.getAll();
        System.out.println("In getall,all = " + bank);
    }

    @Test
    public void create() {
        Bank created = this.repository.create(this.bank);
        System.out.println("the create, done =" + created);
        Assert.assertNotNull(created);
        Assert.assertNotSame(created, this.bank);
    }

    @Test
    public void update() {

        String newBankName = "ABSAs";
        Bank updated = new Bank.Builder().copy(getSaved()).Id(newBankName).build();
        System.out.println("the update, done = " + updated );
        this.repository.update(updated);
        Assert.assertSame(newBankName,updated.getId());
    }

    @Test
    public void delete() {

        Bank saved = getSaved();
        this.repository.delete(saved.getId());
        getAll();
    }

    @Test
    public void read() {

        Bank saved = getSaved();
        Bank read = this.repository.read(saved.getId());
        System.out.println("the read, read = " + read);
        Assert.assertSame(read,saved);
    }
}