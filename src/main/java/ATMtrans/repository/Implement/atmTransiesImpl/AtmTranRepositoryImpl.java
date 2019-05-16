package ATMtrans.repository.Implement.atmTransiesImpl;

import ATMtrans.domain.atmTransies.AtmTran;
import ATMtrans.repository.repositoryAtmTransies.AtmTranRepository;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Repository
public class AtmTranRepositoryImpl implements AtmTranRepository {
    public static AtmTranRepositoryImpl repository = null;
    private Map<Double, AtmTran> AtmTranTable;

    private AtmTranRepositoryImpl() {
        AtmTranTable = new HashMap<>();
    }

    public static AtmTranRepository getRepository(){
        if (repository == null) repository = new AtmTranRepositoryImpl();
        return repository;
    }

    @Override
    public Set<AtmTran> getAll() {
        return this.getAll();
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
    public void delete(Double aDouble) {
        AtmTranTable.remove(aDouble);

        //return this.delete(aDouble);
    }

    @Override
    public AtmTran read(Double aDouble)
    {
        AtmTran atmTran = AtmTranTable.get(aDouble);
        return atmTran;
    }
}
