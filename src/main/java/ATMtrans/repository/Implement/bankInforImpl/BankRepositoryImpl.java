package ATMtrans.repository.Implement.bankInforImpl;

import ATMtrans.domain.atmTransies.Balance;
import ATMtrans.domain.bankInfor.Bank;
import ATMtrans.repository.repositoryBankInfor.BankRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BankRepositoryImpl implements BankRepository {

    public static BankRepositoryImpl repository = null;
    private Set<Bank> banks;

    private BankRepositoryImpl() {
        banks = new HashSet<>();
    }

    private Bank findBank(String Id){
        return this.banks.stream()
                .filter( bank -> bank.getId().trim().equals( Id ) )
                .findAny()
                .orElse( null );
    }
    public static BankRepository getRepository(){
        if (repository == null) repository = new BankRepositoryImpl();
        return repository;
    }
    @Override
    public Set<Bank> getAll() {
        return this.banks;
    }

    @Override
    public Bank create(Bank bank) {
        this.banks.add( bank );
        return bank;
    }
    @Override
    public Bank update(Bank bank) {
        Bank toUpdate = findBank( bank.getId() );
        if(toUpdate != null){
            this.banks.remove( toUpdate );
            return create(bank );
        }
        return null;
    }
    @Override
    public void delete(String Id) {
        Bank bank = findBank( Id );
        if(bank != null) this.banks.remove( bank );
    }

    @Override
    public Bank read(String Id) {
        Bank bank = findBank( Id );
        return bank;
    }
}
