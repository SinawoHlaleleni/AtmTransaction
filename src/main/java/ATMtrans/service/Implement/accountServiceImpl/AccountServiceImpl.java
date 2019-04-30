package ATMtrans.service.Implement.accountServiceImpl;

import ATMtrans.domain.account.Account;
import ATMtrans.repository.Implement.accountImpl.AccountRepositoryImpl;
import ATMtrans.repository.repositoryAccount.AccountRepository;
import ATMtrans.service.accountService.AccountService;

import java.util.Set;

public class AccountServiceImpl implements AccountService {



    public static AccountServiceImpl service = null;
    private AccountRepository repository;

    private AccountServiceImpl() {
       this.repository= AccountRepositoryImpl.getRepository();
    }
    public AccountService getService(){
        if(service == null) service = new AccountServiceImpl();
        return service;
    }
    @Override
    public Set<Account> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Account create(Account account) {
        return this.repository.create(account);
    }

    @Override
    public Account update(Account account) {
        return this.repository.update(account);
    }

    @Override
    public void delete(Double aDouble) {
    repository.delete(aDouble);
    }

    @Override
    public Account read(Double aDouble) {
        return this.repository.delete(aDouble);
    }
}

