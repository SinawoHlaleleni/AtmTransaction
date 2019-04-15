package ATMtrans.factoryAccount;

import ATMtrans.account.Statement;
import ATMtrans.util.Misc;

public class StatementFactory {

    public static Statement getAccount(String accType){

        return new Statement.Builder()
                .id(Misc.generateId())
                .type(accType)
                .build();
    }
}
