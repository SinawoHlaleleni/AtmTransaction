package ATMtrans.factoryDomain;

import ATMtrans.domain.Balance;

public class BalanceFactory {

    public static Balance getAmount(double amount) {
        return new Balance.Builder()
                .amount(amount)
               // .amount(Misc.generateId())
                .build();
    }



}





