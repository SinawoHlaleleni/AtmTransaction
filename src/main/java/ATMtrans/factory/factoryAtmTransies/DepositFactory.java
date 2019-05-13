package ATMtrans.factory.factoryAtmTransies;

import ATMtrans.domain.atmTransies.Deposit;

public class DepositFactory {

    public static Deposit getAmount(double amount) {
        return new Deposit.Builder()
                .amount(amount)
                //.amount(Misc.generateId())
                .build();
    }
}
