package ATMtrans.factory.factoryOrders;

import ATMtrans.domain.orders.CreditOrder;

public class CreditOrderFactory {

    public static CreditOrder getAmount(double amount) {
        return new CreditOrder.Builder()
                .amount(amount)
                //.amount(Misc.generateId())
                .build();
    }
}
