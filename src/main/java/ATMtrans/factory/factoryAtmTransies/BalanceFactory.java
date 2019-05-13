package ATMtrans.factory.factoryAtmTransies;

import ATMtrans.domain.atmTransies.Balance;

public class BalanceFactory {

    public static Balance getAmount(double amount) {
        return new Balance.Builder()
                .amount(amount)
               // .amount(Misc.generateId())
                .build();
    }



}





