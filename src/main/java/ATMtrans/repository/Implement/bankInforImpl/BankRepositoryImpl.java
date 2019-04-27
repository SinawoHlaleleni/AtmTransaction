package ATMtrans.repository.Implement.bankInforImpl;

import ATMtrans.domain.bankInfor.Bank;
import ATMtrans.repository.repositoryBankInfor.BankRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BankRepositoryImpl implements BankRepository {

    public static BankRepositoryImpl repository = null;
    private Map<String, Bank> BankTable;

    private BankRepositoryImpl() {
        BankTable = new HashMap<String, Bank>();
    }

    public static BankRepository getRepository(){
        if (repository == null) repository = new BankRepositoryImpl();
        return repository;
    }
    @Override
    public Set<Bank> getAll() {
        return null;
    }

    @Override
    public Bank create(Bank bank) {
        BankTable.put(bank.getName(),bank);
        Bank bank1 = BankTable.get(bank.getName());
        return bank1;
    }
    @Override
    public Bank update(Bank bank) {
        BankTable.put(bank.getName(),bank);
        Bank bank1 = BankTable.get(bank.getName());
        return bank1;
    }
    @Override
    public void delete(String s) {
        BankTable.remove(s);

    }

    @Override
    public Bank read(String s) {
        Bank bank = BankTable.get(s);
        return bank;
    }
}
