package ATMtrans.service.Implement.atmTransiesServiceImpl;

import ATMtrans.domain.atmTransies.AtmTran;
import ATMtrans.repository.Implement.atmTransiesImpl.AtmTranRepositoryImpl;
import ATMtrans.repository.repositoryAtmTransies.AtmTranRepository;
import ATMtrans.service.atmTransiesService.AtmTranService;

import java.util.Set;

public class AtmTranServiceImpl implements AtmTranService {

    public static AtmTranServiceImpl service = null;
    private AtmTranRepository repository;
    private AtmTranServiceImpl(){
        this.repository= AtmTranRepositoryImpl.getRepository();
    }
    public AtmTranService getService(){
        if(service == null) service = new AtmTranServiceImpl();
        return service;
    }

    @Override
    public Set<AtmTran> getAll() {
        return this.repository.getAll();
    }

    @Override
    public AtmTran create(AtmTran atmTran) {
        return this.repository.create(atmTran);
    }

    @Override
    public AtmTran update(AtmTran atmTran) {
        return this.repository.update(atmTran);
    }

    @Override
    public void delete(Double aDouble) {
    repository.delete(aDouble);
    }

    @Override
    public AtmTran read(Double aDouble) {
        return this.repository.read(aDouble);
    }
}
