package ATMtrans.factoryAccount;

import ATMtrans.account.Check;

public class CheckFactory {

    public static Check getAmount(double amount) {
        return new Check.Builder()
                .amount(amount)
                //.amount(Misc.generateId())
                .build();
    }
}
