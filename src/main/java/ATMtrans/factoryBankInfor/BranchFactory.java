package ATMtrans.factoryBankInfor;

import ATMtrans.bankInfor.Branch;
import ATMtrans.util.Misc;

public class BranchFactory {

    public static Branch getName(String Name) {
        return new Branch.Builder()
                .Name("...")
                .Id(Misc.generateId())
                .build();
    }
}
