package ATMtrans.factory.factoryAccount;

import ATMtrans.domain.account.Fixed;

public class FixedFactory {
    public static Fixed getAmount(double amount) {
        return new Fixed.Builder()
                .amount(amount)
                //.amount(Misc.generateId())
                .build();
    }

}
