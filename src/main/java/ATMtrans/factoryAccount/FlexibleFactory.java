package ATMtrans.factoryAccount;

import ATMtrans.account.Flexible;

public class FlexibleFactory {

    public static Flexible getAmount(double amount) {
        return new Flexible.Builder()
                .amount(amount)
                //.amount(Misc.generateId())
                .build();
    }
}
