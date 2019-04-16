package ATMtrans.factoryCardless;

import ATMtrans.cardless.Ewallet;
import ATMtrans.util.Misc;

public class EwalletFactory {

    public static  Ewallet getAmount(double tAmount) {
        return new  Ewallet.Builder()
                .Amount(tAmount)
                .num("0736072671")
                .Id(Misc.generateId())
                .build();
    }

}
