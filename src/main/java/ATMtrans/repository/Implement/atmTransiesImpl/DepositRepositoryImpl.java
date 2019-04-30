package ATMtrans.repository.Implement.atmTransiesImpl;

import ATMtrans.domain.account.Account;
import ATMtrans.domain.atmTransies.Deposit;
import ATMtrans.repository.repositoryAtmTransies.DepositRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DepositRepositoryImpl implements DepositRepository {
    public static DepositRepositoryImpl repository = null;
    private Map<Double, Deposit> depositTable;

    private DepositRepositoryImpl() {
        depositTable = new HashMap<>();
    }

    public static DepositRepository getRepository(){
        if (repository == null) repository = new DepositRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Deposit> getAll() {
        return this.getAll();
    }

    @Override
    public Deposit create(Deposit deposit) {
        depositTable.put(deposit.getAmount(),deposit);
        Deposit deposit1 = depositTable.get(deposit.getAmount());
        return deposit1;
    }

    @Override
    public Deposit update(Deposit deposit) {
        depositTable.put(deposit.getAmount(),deposit);
        Deposit deposit1 = depositTable.get(deposit.getAmount());
        return deposit1;

    }

    @Override
    public Account delete(Double aDouble) {
       // depositTable.remove(aDouble);

        return this.delete(aDouble);
    }

    @Override
    public Deposit read(Double aDouble) {
        Deposit deposit = depositTable.get(aDouble);
        return deposit;
    }
}
