package ATMtrans.service.Implement.cardlessInforServiceImpl;

import ATMtrans.domain.cardless.CardlessService;
import ATMtrans.repository.Implement.cardlessImpl.CardlessServiceRepositoryImpl;
import ATMtrans.repository.repositoryCardless.CardlessServiceRepository;
import ATMtrans.service.cardlessService.CardlessSerService;

import java.util.Set;

public class CardlessServiceImpl implements CardlessSerService {

    public static CardlessServiceImpl service = null;
    private CardlessServiceRepository repository;
    private CardlessServiceImpl(){
        this.repository= CardlessServiceRepositoryImpl.getRepository();
    }
    public CardlessServiceImpl getService(){
        if(service == null) service = new CardlessServiceImpl();
        return service;
    }

    @Override
    public Set<CardlessService> getAll() {
        return this.repository.getAll();
    }

    @Override
    public CardlessService create(CardlessService cardlessService) {
        return this.repository.create(cardlessService);
    }

    @Override
    public CardlessService update(CardlessService cardlessService) {
        return this.repository.update(cardlessService);
    }

    @Override
    public void delete(Double aDouble) {
    repository.delete(aDouble);
    }

    @Override
    public CardlessService read(Double aDouble) {
        return this.repository.read(aDouble);
    }
}
