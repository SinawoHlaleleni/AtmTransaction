package ATMtrans.factoryCardless;

import ATMtrans.cardless.Ewallet;
import ATMtrans.util.Misc;

public class EwalletFactory {

    public static  Ewallet getAmount(double tAmount) {
        return new  Ewallet.Builder()
                .Amount(tAmount)
                .num("...")
                .Id(Misc.generateId())
                .build();
    }

}
