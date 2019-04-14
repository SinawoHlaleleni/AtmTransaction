package ATMtrans.factory;

import ATMtrans.domain.Deposit;
import ATMtrans.util.Misc;

public class DepositFactory {

    public static Deposit getAmount(double amount) {
        return new Deposit.Builder()
                .amount(amount)
                //.amount(Misc.generateId())
                .build();
    }
}
