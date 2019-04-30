package ATMtrans.repository.Implement.atmInforImpl;

import ATMtrans.domain.account.Account;
import ATMtrans.domain.atmInfor.Topup;
import ATMtrans.repository.repositoryAtmInf.TopupRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TopupRepositoryImpl implements TopupRepository {

    public static TopupRepositoryImpl repository = null;
    private Map<String, Topup> TopupTable;

    private TopupRepositoryImpl() {
        TopupTable = new HashMap<String, Topup>();
    }

    public static TopupRepository getRepository(){
        if (repository == null) repository = new TopupRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Topup> getAll() {
        return null;
    }

    @Override
    public Topup create(Topup topup) {

        TopupTable.put(Topup.getType(),topup);
        Topup topup1 = TopupTable.get(Topup.getType());
        return topup1;

    }

    @Override
    public Topup update(Topup topup) {
        TopupTable.put(Topup.getType(),topup);
        Topup topup1 = TopupTable.get(Topup.getType());
        return topup1;

    }

    @Override
    public Account delete(Double aDouble) {
        TopupTable.remove(aDouble);

        return null;
    }

    @Override
    public Topup read(Double aDouble) {
        Topup topup = TopupTable.get(aDouble);
        return topup;
    }
}
