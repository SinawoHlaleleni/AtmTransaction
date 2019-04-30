package ATMtrans.repository.Implement.atmInforImpl;

import ATMtrans.domain.account.Account;
import ATMtrans.domain.atmInfor.Airtime;
import ATMtrans.repository.repositoryAtmInf.AirtimeRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AirtimeRepositoryImpl implements AirtimeRepository {

    public static AirtimeRepositoryImpl repository = null;
    private Map<Double, Airtime> AirtimeTable;

    private AirtimeRepositoryImpl() {
        AirtimeTable = new HashMap<Double, Airtime>();
    }

    public static AirtimeRepository getRepository(){
        if (repository == null) repository = new AirtimeRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Airtime> getAll() {
        return null;
    }

    @Override
    public Airtime create(Airtime airtime) {
        AirtimeTable.put(Airtime.gettAmount(),airtime);
        Airtime airtime1 = AirtimeTable.get(Airtime.gettAmount());
        return airtime1;
    }

    @Override
    public Airtime update(Airtime airtime) {
        AirtimeTable.put(Airtime.gettAmount(),airtime);
        Airtime airtime1 = AirtimeTable.get(Airtime.gettAmount());
        return airtime1;

    }

    @Override
    public Account delete(Double aDouble) {
        AirtimeTable.remove(aDouble);

        return null;
    }

    @Override
    public Airtime read(Double aDouble) {
        Airtime airtime = AirtimeTable.get(aDouble);
        return airtime;
    }
}
