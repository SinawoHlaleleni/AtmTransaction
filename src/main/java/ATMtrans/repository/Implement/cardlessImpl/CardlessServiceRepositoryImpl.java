package ATMtrans.repository.Implement.cardlessImpl;

import ATMtrans.domain.cardless.CardlessService;
import ATMtrans.repository.repositoryCardless.CardlessServiceRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CardlessServiceRepositoryImpl implements CardlessServiceRepository {

    public static CardlessServiceRepositoryImpl repository = null;
    private Map<String, CardlessService> CardlessServiceTable;

    private CardlessServiceRepositoryImpl() {
        CardlessServiceTable = new HashMap<String,CardlessService>();
    }

    public static CardlessServiceRepository getRepository(){
        if (repository == null) repository = new CardlessServiceRepositoryImpl();
        return repository;
    }


    @Override
    public Set<CardlessService> getAll() {
        return null;
    }

    @Override
    public CardlessService create(CardlessService cardlessService) {

        CardlessServiceTable.put(cardlessService.getType(),cardlessService);
        CardlessService cardlessService1 = CardlessServiceTable.get(cardlessService.getType());
        return cardlessService1;

    }

    @Override
    public CardlessService update(CardlessService cardlessService) {
        CardlessServiceTable.put(cardlessService.getType(),cardlessService);
        CardlessService cardlessService1 = CardlessServiceTable.get(cardlessService.getType());
        return cardlessService1;

    }

    @Override
    public void delete(Double aDouble) {
        CardlessServiceTable.remove(aDouble);

    }

    @Override
    public CardlessService read(Double aDouble) {
        CardlessService cardlessService = CardlessServiceTable.get(aDouble);
        return cardlessService;
    }
}
