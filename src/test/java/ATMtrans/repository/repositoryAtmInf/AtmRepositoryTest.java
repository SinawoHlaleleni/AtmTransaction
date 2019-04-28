package ATMtrans.repository.repositoryAtmInf;

import ATMtrans.domain.atmInfor.Atm;
import ATMtrans.factoryDomain.factoryAtmInfor.AtmFactory;
import ATMtrans.repository.Implement.atmInforImpl.AtmRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AtmRepositoryTest {

    String id;
    String type;
    AtmRepository atmR;

    @Before
    public void setUp() throws Exception {
            atmR = AtmRepositoryImpl.getRepository();
            id=("sm002");
            type=("ABSA");
        }

    @Test
    public  void create() throws Exception{

        Atm atm = AtmFactory.getType(type);
        atmR.create(atm);
        assertEquals("ABSA",atm.getType());
    }

    @Test //(dependsOnMethods = "create")
    public void read()throws Exception{
        Atm readAtm = atmR.read(type);
        assertEquals("ABSA",readAtm.getType());

    }
    @Test
    public void Update()throws Exception{
        Atm atm = atmR.read(type);
        Atm newAtm = new Atm.Builder()
                .Type(atm.getType())
                .Id(atm.getId())
                .build();
        atmR.update(newAtm);
        Atm UpdateAtm = atmR.read(type);
        assertEquals("Capitec",UpdateAtm.getType());

    }
    @Test
    public void delete() throws Exception{
        atmR.delete(type);
        Atm atm = atmR.read(type);
        assertNull(atm);
    }


}
