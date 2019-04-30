package ATMtrans.service.Implement.accountServiceImpl;

import ATMtrans.domain.account.Fixed;
import ATMtrans.repository.Implement.accountImpl.FixedRepositoryImpl;
import ATMtrans.repository.repositoryAccount.FixedRepository;
import ATMtrans.service.accountService.FixedService;

import java.util.Set;

public class FixedServiceImpl implements FixedService {
    public static FixedServiceImpl service = null;
    private FixedRepository repository;
    private FixedServiceImpl(){
        this.repository= FixedRepositoryImpl.getRepository();
    }
    public FixedService getService(){
        if(service == null) service = new FixedServiceImpl();
        return service;
    }

    @Override
    public Set<Fixed> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Fixed create(Fixed fixed) {
        return this.repository.create(fixed);
    }

    @Override
    public Fixed update(Fixed fixed) {
        return this.repository.update(fixed);
    }

    @Override
    public void delete(String s) {
        repository.delete(s);
    }

    @Override
    public Fixed read(String s) {
        return this.repository.read(s);
    }
}
