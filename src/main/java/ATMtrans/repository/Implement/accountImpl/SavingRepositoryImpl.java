package ATMtrans.repository.Implement.accountImpl;

import ATMtrans.domain.account.Savings;
import ATMtrans.repository.repositoryAccount.SavingsRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SavingRepositoryImpl implements SavingsRepository {

    public static SavingRepositoryImpl repository = null;
    private Map<Double, Savings> SavingsTable;

    private SavingRepositoryImpl() {
        SavingsTable = new HashMap<>();
    }

    public static SavingRepositoryImpl getRepository(){
        if (repository == null) repository = new SavingRepositoryImpl();
        return repository;
    }
    @Override
    public Set<Savings> getAll() {
        return this.getAll();
    }

    @Override
    public Savings create(Savings savings) {
        SavingsTable.put(savings.getAmount(),savings);
        Savings savings1 = SavingsTable.get(savings.getAmount());
        return savings1;

    }

    @Override
    public Savings update(Savings savings) {
        SavingsTable.put(savings.getAmount(),savings);
        Savings savings1 = SavingsTable.get(savings.getAmount());
        return savings1;
    }

    @Override
    public void delete(String s) {
        SavingsTable.remove(s);
       // return this.delete(s);
    }

    @Override
    public Savings read(String s) {
        Savings savings = SavingsTable.get(s);
        return savings;
    }
}
