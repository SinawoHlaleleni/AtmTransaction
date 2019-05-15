package ATMtrans.repository.Implement.accountImpl;

import ATMtrans.domain.account.Check;
import ATMtrans.repository.repositoryAccount.CheckRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CheckRepositoryImpl implements CheckRepository {

    public static CheckRepositoryImpl repository = null;
    private Map<Double, Check> checkTable;

    private CheckRepositoryImpl() {
        checkTable = new HashMap<>();
    }

    public static CheckRepository getRepository(){
        if (repository == null) repository = new CheckRepositoryImpl();
        return repository;
    }
    @Override
    public Set<Check> getAll() {
        return this.getAll();
    }

    @Override
    public Check create(Check check) {
        checkTable.put(check.getAmount(),check);
        Check check1 = checkTable.get(check.getAmount());
        return check1;
    }

    @Override
    public Check update(Check check) {

        checkTable.put(check.getAmount(),check);
        Check check1 = checkTable.get(check.getAmount());
        return check1;
    }

    @Override
    public void delete(String s) {
        checkTable.remove(s);
        //return this.delete(s);
    }

    @Override
    public Check read(String s) {
        Check check = checkTable.get(s);
        return check;
    }
}
