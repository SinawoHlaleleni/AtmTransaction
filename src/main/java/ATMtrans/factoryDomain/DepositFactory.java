package ATMtrans.factoryDomain;

import ATMtrans.domain.Deposit;

public class DepositFactory {

    public static Deposit getAmount(double amount) {
        return new Deposit.Builder()
                .amount(amount)
                //.amount(Misc.generateId())
                .build();
    }
}
