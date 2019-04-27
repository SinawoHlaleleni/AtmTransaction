package ATMtrans.factoryDomain;

import ATMtrans.domain.Withdrawal;

public class WithdrawalFactory {

    public static Withdrawal getAmount(double amount) {
        return new Withdrawal.Builder()
                .amount(amount)
                //.amount(Misc.generateId())
                .build();
    }
}
