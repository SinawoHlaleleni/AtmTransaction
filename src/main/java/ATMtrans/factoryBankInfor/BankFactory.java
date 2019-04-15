package ATMtrans.factoryBankInfor;

import ATMtrans.bankInfor.Bank;
import ATMtrans.util.Misc;

public class BankFactory {

    public static Bank getName(String Name) {
        return new Bank.Builder()
                .Name("...")
                .Id(Misc.generateId())
                .build();
    }
}
