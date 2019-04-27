package ATMtrans.repository.Implement.atmInforImpl;

import ATMtrans.domain.atmInfor.CashLimit;
import ATMtrans.repository.repositoryAtmInf.CashLimitRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CashLimitRepositoryImpl implements CashLimitRepository {

    public static CashLimitRepositoryImpl repository = null;
    private Map<Double, CashLimit> CashLimitTable;

    private CashLimitRepositoryImpl() {
        CashLimitTable = new HashMap<Double, CashLimit>();
    }

    public static CashLimitRepository getRepository(){
        if (repository == null) repository = new CashLimitRepositoryImpl();
        return repository;
    }


    @Override
    public CashLimit create(CashLimit cashLimit) {

        CashLimitTable.put(CashLimit.getAmount(),cashLimit);
        CashLimit statement1 = CashLimitTable.get(CashLimit.getAmount());
        return statement1;

    }

    @Override
    public CashLimit update(CashLimit cashLimit) {
        CashLimitTable.put(CashLimit.getAmount(),cashLimit);
        CashLimit statement1 = CashLimitTable.get(CashLimit.getAmount());
        return statement1;

    }

    @Override
    public void delete(Double aDouble) {
        CashLimitTable.remove(aDouble);

    }

    @Override
    public CashLimit read(Double aDouble) {
        CashLimit cashLimit = CashLimitTable.get(aDouble);
        return cashLimit;
    }

    @Override
    public Set<CashLimit> getAll()
    {
        return null;
    }
}
