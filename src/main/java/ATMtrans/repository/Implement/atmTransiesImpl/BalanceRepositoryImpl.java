package ATMtrans.repository.Implement.atmTransiesImpl;

import ATMtrans.domain.account.Account;
import ATMtrans.domain.atmTransies.Balance;
import ATMtrans.repository.repositoryAtmTransies.BalanceRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BalanceRepositoryImpl implements BalanceRepository {

    public static BalanceRepositoryImpl repository = null;
    private Map<Double, Balance> BalanceTable;

    private BalanceRepositoryImpl() {
        BalanceTable = new HashMap<>();
    }

    public static BalanceRepository getRepository(){
        if (repository == null) repository = new BalanceRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Balance> getAll() {
        return this.getAll();
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
    public Account delete(Double aDouble) {

       // BalanceTable.remove(aDouble);
        return this.delete(aDouble);
    }

    @Override
    public Balance read(Double aDouble) {
        Balance balance = BalanceTable.get(aDouble);
        return balance;
    }
}
