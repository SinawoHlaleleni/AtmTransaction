package ATMtrans.factory;

import ATMtrans.domain.Balance;
import ATMtrans.util.Misc;

public class BalanceFactory {

    public static Balance getAmount(double amount) {
        return new Balance.Builder()
                .amount(amount)
               // .amount(Misc.generateId())
                .build();
    }



}





