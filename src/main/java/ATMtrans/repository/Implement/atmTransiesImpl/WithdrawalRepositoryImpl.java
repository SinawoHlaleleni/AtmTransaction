package ATMtrans.repository.Implement.atmTransiesImpl;

import ATMtrans.domain.account.Account;
import ATMtrans.domain.atmTransies.Withdrawal;
import ATMtrans.repository.repositoryAtmTransies.WithdrawalRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WithdrawalRepositoryImpl implements WithdrawalRepository {

    public static WithdrawalRepositoryImpl repository = null;
    private Map<Double, Withdrawal> WithdrawalTable;

    private WithdrawalRepositoryImpl() {
        WithdrawalTable = new HashMap<Double, Withdrawal>();
    }

    public static WithdrawalRepository getRepository(){
        if (repository == null) repository = new WithdrawalRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Withdrawal> getAll() {
        return null;
    }

    @Override
    public Withdrawal create(Withdrawal withdrawal) {
        WithdrawalTable.put(withdrawal.getAmount(),withdrawal);
        Withdrawal cashTransfer1 = WithdrawalTable.get(withdrawal.getAmount());
        return cashTransfer1;

    }

    @Override
    public Withdrawal update(Withdrawal withdrawal) {

        WithdrawalTable.put(withdrawal.getAmount(),withdrawal);
        Withdrawal cashTransfer1 = WithdrawalTable.get(withdrawal.getAmount());
        return cashTransfer1;

    }

    @Override
    public Account delete(Double aDouble) {
        WithdrawalTable.remove(aDouble);

        return null;
    }

    @Override
    public Withdrawal read(Double aDouble) {

        Withdrawal withdrawal = WithdrawalTable.get(aDouble);
        return withdrawal;
    }
}
