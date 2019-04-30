package ATMtrans.repository.Implement.cardlessImpl;

import ATMtrans.domain.account.Account;
import ATMtrans.domain.cardless.Ewallet;
import ATMtrans.repository.repositoryCardless.EwalletRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EwalletRepositoryImpl implements EwalletRepository {

    public static EwalletRepositoryImpl repository = null;
    private Map<Double, Ewallet> EwalletTable;

    private EwalletRepositoryImpl() {
        EwalletTable = new HashMap<>();
    }

    public static EwalletRepository getRepository(){
        if (repository == null) repository = new EwalletRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Ewallet> getAll() {
        return this.getAll();
    }

    @Override
    public Ewallet create(Ewallet ewallet) {

        EwalletTable.put(ewallet.getAmount(),ewallet);
        Ewallet atmTran1 = EwalletTable.get(ewallet.getAmount());
        return atmTran1;
    }

    @Override
    public Ewallet update(Ewallet ewallet) {
        EwalletTable.put(ewallet.getAmount(),ewallet);
        Ewallet atmTran1 = EwalletTable.get(ewallet.getAmount());
        return atmTran1;
    }

    @Override
    public Account delete(Double aDouble) {
       // EwalletTable.remove(aDouble);

        return this.delete(aDouble);
    }

    @Override
    public Ewallet read(Double aDouble) {
        Ewallet ewallet = EwalletTable.get(aDouble);
        return ewallet;
    }
}
