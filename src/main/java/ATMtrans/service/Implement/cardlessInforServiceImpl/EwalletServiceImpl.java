package ATMtrans.service.Implement.cardlessInforServiceImpl;

import ATMtrans.domain.cardless.Ewallet;
import ATMtrans.repository.Implement.cardlessImpl.EwalletRepositoryImpl;
import ATMtrans.repository.repositoryCardless.EwalletRepository;
import ATMtrans.service.cardlessService.EwalletService;

import java.util.Set;

public class EwalletServiceImpl implements EwalletService {

    public static EwalletServiceImpl service = null;
    private EwalletRepository repository;
    private EwalletServiceImpl(){
        this.repository= EwalletRepositoryImpl.getRepository();
    }
    public EwalletService getService(){
        if(service == null) service = new EwalletServiceImpl();
        return service;
    }

    @Override
    public Set<Ewallet> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Ewallet create(Ewallet ewallet) {
        return this.repository.create(ewallet);
    }

    @Override
    public Ewallet update(Ewallet ewallet) {
        return this.repository.update(ewallet);
    }

    @Override
    public void delete(Double aDouble) {
        repository.delete(aDouble);

    }

    @Override
    public Ewallet read(Double aDouble) {
        return this.repository.read(aDouble);
    }
}
