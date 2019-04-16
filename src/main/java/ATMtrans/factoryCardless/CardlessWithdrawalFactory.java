package ATMtrans.factoryCardless;

import ATMtrans.cardless.CardlessWithdrawal;
import ATMtrans.util.Misc;

public class CardlessWithdrawalFactory {

    public static CardlessWithdrawal getAmount(double amount) {
        return new CardlessWithdrawal.Builder()
                .amount(amount)
                //.amount(Misc.generateId())
                .build();
    }


}
