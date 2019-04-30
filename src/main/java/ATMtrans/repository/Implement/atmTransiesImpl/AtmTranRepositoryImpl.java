package ATMtrans.repository.Implement.atmTransiesImpl;

import ATMtrans.domain.account.Account;
import ATMtrans.domain.atmTransies.AtmTran;
import ATMtrans.repository.repositoryAtmTransies.AtmTranRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmTranRepositoryImpl implements AtmTranRepository {
    public static AtmTranRepositoryImpl repository = null;
    private Map<Double, AtmTran> AtmTranTable;

    private AtmTranRepositoryImpl() {
        AtmTranTable = new HashMap<Double, AtmTran>();
    }

    public static AtmTranRepository getRepository(){
        if (repository == null) repository = new AtmTranRepositoryImpl();
        return repository;
    }

    @Override
    public Set<AtmTran> getAll() {
        return null;
    }

    @Override
    public AtmTran create(AtmTran atmTran) {

        AtmTranTable.put(atmTran.getAmount(),atmTran);
        AtmTran atmTran1 = AtmTranTable.get(atmTran.getAmount());
        return atmTran1;

    }

    @Override
    public AtmTran update(AtmTran atmTran)
    {
        AtmTranTable.put(atmTran.getAmount(),atmTran);
        AtmTran atmTran1 = AtmTranTable.get(atmTran.getAmount());
        return atmTran1;
    }

    @Override
    public Account delete(Double aDouble) {
        AtmTranTable.remove(aDouble);

        return null;
    }

    @Override
    public AtmTran read(Double aDouble)
    {
        AtmTran atmTran = AtmTranTable.get(aDouble);
        return atmTran;
    }
}
