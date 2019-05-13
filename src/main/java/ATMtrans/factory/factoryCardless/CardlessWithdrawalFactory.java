package ATMtrans.factory.factoryCardless;

import ATMtrans.domain.cardless.CardlessWithdrawal;

public class CardlessWithdrawalFactory {

    public static CardlessWithdrawal getAmount(double amount) {
        return new CardlessWithdrawal.Builder()
                .amount(amount)
                //.amount(Misc.generateId())
                .build();
    }


}
