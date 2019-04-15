package ATMtrans.factoryCardless;

import ATMtrans.cardless.CardlessService;
import ATMtrans.util.Misc;

public class CardlessServiceFactory {

    public static CardlessService getType(String Type) {
        return new CardlessService.Builder()
                .Type("...")
                .Id(Misc.generateId())
                .build();
    }
}
