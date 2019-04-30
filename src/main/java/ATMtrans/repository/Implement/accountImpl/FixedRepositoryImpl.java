package ATMtrans.repository.Implement.accountImpl;

import ATMtrans.domain.account.Account;
import ATMtrans.domain.account.Fixed;
import ATMtrans.repository.repositoryAccount.FixedRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FixedRepositoryImpl implements FixedRepository {

    public static FixedRepositoryImpl repository = null;
    private Map<Double, Fixed> fixedTable;

    private FixedRepositoryImpl() {
        fixedTable = new HashMap<>();
    }

    public static FixedRepository getRepository(){
        if (repository == null) repository = new FixedRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Fixed> getAll() {
        return this.getAll();
    }

    @Override
    public Fixed create(Fixed fixed) {

        fixedTable.put(fixed.getAmount(),fixed);
        Fixed check1 = fixedTable.get(fixed.getAmount());
        return check1;
    }

    @Override
    public Fixed update(Fixed fixed) {
        fixedTable.put(fixed.getAmount(),fixed);
        Fixed check1 = fixedTable.get(fixed.getAmount());
        return check1;
    }

    @Override
    public Account delete(String s) {
        //fixedTable.remove(s);
        return this.delete(s);
    }

    @Override
    public Fixed read(String s) {
        Fixed fixed = fixedTable.get(s);
        return fixed;
    }
}
