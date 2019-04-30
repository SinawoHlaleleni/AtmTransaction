package ATMtrans.repository.Implement.cardlessImpl;

import ATMtrans.domain.account.Account;
import ATMtrans.domain.cardless.CardlessWithdrawal;
import ATMtrans.repository.repositoryCardless.CardlessWithdrawalRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CardlessWithdrawalRepositoryImpl implements CardlessWithdrawalRepository {
    public static CardlessWithdrawalRepositoryImpl repository = null;
    private Map<Double, CardlessWithdrawal> CardlessWithdrawalTable;

    private CardlessWithdrawalRepositoryImpl() {
        CardlessWithdrawalTable = new HashMap<Double,CardlessWithdrawal>();
    }

    public static CardlessWithdrawalRepository getRepository(){
        if (repository == null) repository = new CardlessWithdrawalRepositoryImpl();
        return repository;
    }

    @Override
    public Set<CardlessWithdrawal> getAll() {
        return null;
    }

    @Override
    public CardlessWithdrawal create(CardlessWithdrawal cardlessWithdrawal) {
        CardlessWithdrawalTable.put(cardlessWithdrawal.getAmount(),cardlessWithdrawal);
        CardlessWithdrawal cardlessWithdrawal1 = CardlessWithdrawalTable.get(cardlessWithdrawal.getAmount());
        return cardlessWithdrawal1;
    }

    @Override
    public CardlessWithdrawal update(CardlessWithdrawal cardlessWithdrawal) {
        CardlessWithdrawalTable.put(cardlessWithdrawal.getAmount(),cardlessWithdrawal);
        CardlessWithdrawal cardlessWithdrawal1 = CardlessWithdrawalTable.get(cardlessWithdrawal.getAmount());
        return cardlessWithdrawal1;
    }

    @Override
    public Account delete(Double aDouble) {
        CardlessWithdrawalTable.remove(aDouble);

        return null;
    }

    @Override
    public CardlessWithdrawal read(Double aDouble) {
        CardlessWithdrawal cardlessWithdrawal= CardlessWithdrawalTable.get(aDouble);
        return cardlessWithdrawal;
    }
}
