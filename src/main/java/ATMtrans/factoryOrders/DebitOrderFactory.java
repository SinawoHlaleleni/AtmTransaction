package ATMtrans.factoryOrders;

import ATMtrans.orders.DebitOrders;
import ATMtrans.util.Misc;

public class DebitOrderFactory {

    public static DebitOrders getDebitOrders(String Type){

        return new DebitOrders.Builder()
                .Id(Misc.generateId())
                .Type(Type)
                .build();
    }

}
