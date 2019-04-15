package ATMtrans.factoryOrders;

import ATMtrans.orders.CreditOrder;

public class CreditOrderFactory {

    public static CreditOrder getAmount(double amount) {
        return new CreditOrder.Builder()
                .amount(amount)
                //.amount(Misc.generateId())
                .build();
    }
}
