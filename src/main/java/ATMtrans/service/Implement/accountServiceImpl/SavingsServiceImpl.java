package ATMtrans.service.Implement.accountServiceImpl;

import ATMtrans.domain.account.Savings;
import ATMtrans.repository.Implement.accountImpl.SavingRepositoryImpl;
import ATMtrans.repository.repositoryAccount.SavingsRepository;
import ATMtrans.service.accountService.SavingsService;

import java.util.Set;

public class SavingsServiceImpl implements SavingsService {

    public static SavingsServiceImpl service = null;
    private SavingsRepository repository;
    private SavingsServiceImpl(){
        this.repository= SavingRepositoryImpl.getRepository();
    }
    public SavingsService getService(){
        if(service == null) service = new SavingsServiceImpl();
        return service;
    }

    @Override
    public Set<Savings> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Savings create(Savings savings) {
        return this.repository.create(savings);
    }

    @Override
    public Savings update(Savings savings) {
        return this.repository.update(savings);
    }

    @Override
    public void delete(String s) {
    repository.delete(s);
    }

    @Override
    public Savings read(String s) {
        return this.repository.read(s);
    }
}
