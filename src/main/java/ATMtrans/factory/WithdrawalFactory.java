package ATMtrans.factory;

import ATMtrans.domain.Withdrawal;
import ATMtrans.util.Misc;

public class WithdrawalFactory {

    public static Withdrawal getAmount(double amount) {
        return new Withdrawal.Builder()
                .amount(amount)
                //.amount(Misc.generateId())
                .build();
    }
}
