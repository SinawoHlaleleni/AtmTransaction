package ATMtrans.repository.Implement.atmTransiesImpl;

import ATMtrans.domain.atmTransies.Balance;
import ATMtrans.repository.repositoryAtmTransies.BalanceRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BalanceRepositoryImpl implements BalanceRepository {

    public static BalanceRepositoryImpl repository = null;
    private Map<Double, Balance> BalanceTable;

    private BalanceRepositoryImpl() {
        BalanceTable = new HashMap<Double, Balance>();
    }

    public static BalanceRepository getRepository(){
        if (repository == null) repository = new BalanceRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Balance> getAll() {
        return null;
    }

    @Override
    public Balance create(Balance balance) {
        BalanceTable.put(balance.getAmount(),balance);
        Balance balance1 = BalanceTable.get(balance.getAmount());
        return balance1;

    }

    @Override
    public Balance update(Balance balance) {
        BalanceTable.put(balance.getAmount(),balance);
        Balance balance1 = BalanceTable.get(balance.getAmount());
        return balance1;
    }

    @Override
    public void delete(Double aDouble) {

        BalanceTable.remove(aDouble);
    }

    @Override
    public Balance read(Double aDouble) {
        Balance balance = BalanceTable.get(aDouble);
        return balance;
    }
}
