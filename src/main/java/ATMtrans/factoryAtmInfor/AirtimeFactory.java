package ATMtrans.factoryAtmInfor;

import ATMtrans.atmInfor.Airtime;
import ATMtrans.util.Misc;

public class AirtimeFactory {

    public static Airtime getAmount(double tAmount) {
        return new Airtime.Builder()
                .tAmount(tAmount)
                .tType("...")
                .tId(Misc.generateId())
                .build();
    }
}
