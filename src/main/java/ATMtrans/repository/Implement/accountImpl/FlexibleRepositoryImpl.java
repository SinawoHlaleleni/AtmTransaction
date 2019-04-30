package ATMtrans.repository.Implement.accountImpl;

import ATMtrans.domain.account.Account;
import ATMtrans.domain.account.Flexible;
import ATMtrans.repository.repositoryAccount.FlexibleRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FlexibleRepositoryImpl implements FlexibleRepository {

    public static FlexibleRepositoryImpl repository = null;
    private Map<Double, Flexible> FlexibleTable;

    private FlexibleRepositoryImpl() {
        FlexibleTable = new HashMap<Double, Flexible>();
    }

    public static FlexibleRepository getRepository(){
        if (repository == null) repository = new FlexibleRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Flexible> getAll() {
        return null;
    }

    @Override
    public Flexible create(Flexible flexible) {

        FlexibleTable.put(flexible.getAmount(),flexible);
        Flexible flexible1 = FlexibleTable.get(flexible.getAmount());
        return flexible1;

    }

    @Override
    public Flexible update(Flexible flexible) {
        FlexibleTable.put(flexible.getAmount(),flexible);
        Flexible flexible1 = FlexibleTable.get(flexible.getAmount());
        return flexible1;

    }

    @Override
    public Account delete(String s) {
        FlexibleTable.remove(s);
        return null;
    }

    @Override
    public Flexible read(String s) {
        Flexible flexible = FlexibleTable.get(s);
        return flexible;
    }
}
