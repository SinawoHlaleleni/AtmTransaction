package ATMtrans.repository.repositoryBankInfor;

import ATMtrans.domain.bankInfor.Bank;
import ATMtrans.factoryDomain.factoryBankInfor.BankFactory;
import ATMtrans.repository.Implement.bankInforImpl.BankRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankRepositoryTest {
    String id;
    String name;
    BankRepository bankR;
    @Before
    public void setUp() throws Exception {
            bankR = BankRepositoryImpl.getRepository();
            id=("0s00K");
            name=("ABSA");
        }

    @Test
    public  void create() throws Exception{

        Bank bank = BankFactory.getName(name);
        bankR.create(bank);
        assertEquals("ABSA",bank.getName());
    }

    @Test//(dependsOnMethods = "create")
    public void read()throws Exception{
        Bank readBank = bankR.read(name);
        assertEquals("Absa",readBank.getName());

    }
    @Test
    public void Update()throws Exception{
        Bank bank = bankR.read(name);
        Bank newBank = new Bank.Builder()
                .Name(bank.getName())
                .Id(bank.getId())
                .build();
        bankR.update(newBank);
        Bank UpdateBank = bankR.read(name);
        assertEquals("Capitec",UpdateBank.getName());

    }
    @Test
    public void delete() throws Exception{
       bankR.delete(name);
        Bank atm = bankR.read(name);
        assertNull(atm);
    }

}
