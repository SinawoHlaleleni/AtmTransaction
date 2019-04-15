package ATMtrans.factoryAccount;

import ATMtrans.account.Savings;

public class SavingsFactory {
    public static Savings getAmount(double amount) {
        return new Savings .Builder()
                .amount(amount)
                //.amount(Misc.generateId())
                .build();
    }

}
