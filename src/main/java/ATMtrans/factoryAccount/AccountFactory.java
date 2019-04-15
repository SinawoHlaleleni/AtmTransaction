package ATMtrans.factoryAccount;

import ATMtrans.account.Account;
import ATMtrans.util.Misc;

public class AccountFactory {

    public static Account getAccount(String accType){

        return new Account.Builder()
                .accId(Misc.generateId())
                .accType(accType)
                .build();
    }
}
