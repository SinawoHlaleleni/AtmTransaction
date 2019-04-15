package ATMtrans.factoryAtmInfor;

import ATMtrans.atmInfor.Topup;
import ATMtrans.util.Misc;

public class TopupFactory {

    public static Topup getType(String Type) {
        return new Topup.Builder()
                .Type("...")
                .Id(Misc.generateId())
                .build();
    }

}
