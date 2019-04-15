package ATMtrans.factoryAtmInfor;

import ATMtrans.atmInfor.Electricity;
import ATMtrans.util.Misc;

public class ElectricityFactory {

    public static Electricity getAmount(double tAmount) {
        return new Electricity.Builder()
                .Amount(tAmount)
                .MeterNum("...")
                .Id(Misc.generateId())
                .build();
    }
}
