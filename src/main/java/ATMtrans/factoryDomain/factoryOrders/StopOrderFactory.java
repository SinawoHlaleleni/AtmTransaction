package ATMtrans.factoryDomain.factoryOrders;

import ATMtrans.domain.orders.StopOrder;

public class StopOrderFactory {

    public static StopOrder getAmount(double amount) {
        return new StopOrder.Builder()
                .amount(amount)
                //.amount(Misc.generateId())
                .build();
    }
}
