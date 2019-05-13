package ATMtrans.factory.factoryOrders;

import ATMtrans.domain.orders.StopOrder;

public class StopOrderFactory {

    public static StopOrder getAmount(double amount) {
        return new StopOrder.Builder()
                .amount(amount)
                //.amount(Misc.generateId())
                .build();
    }
}
