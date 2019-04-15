package ATMtrans.factoryCardless;

import ATMtrans.cardless.CardlessWithdrawal;

public class CardlessWithdrawalFactory {

    public static CardlessWithdrawal getAmount(double amount) {
        return new CardlessWithdrawal.Builder()
                .amount(amount)
                //.amount(Misc.generateId())
                .build();
    }


}
