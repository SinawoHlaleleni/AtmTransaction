package ATMtrans.factoryAccount;

import ATMtrans.account.Fixed;
import ATMtrans.util.Misc;

public class FixedFactory {
    public static Fixed getAmount(double amount) {
        return new Fixed.Builder()
                .amount(amount)
                //.amount(Misc.generateId())
                .build();
    }

}
