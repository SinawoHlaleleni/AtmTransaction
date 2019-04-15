package ATMtrans.factoryAtmInfor;

import ATMtrans.atmInfor.CashTransfer;
import ATMtrans.util.Misc;

public class CashTransferFactory {

    public static CashTransfer getAmount(double tAmount) {
        return new CashTransfer.Builder()
                .Amount(tAmount)
                .num("...")
                .Id(Misc.generateId())
                .build();
    }

}
