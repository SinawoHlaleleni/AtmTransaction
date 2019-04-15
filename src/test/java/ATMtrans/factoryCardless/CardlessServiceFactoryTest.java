package ATMtrans.factoryCardless;

import ATMtrans.cardless.CardlessService;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardlessServiceFactoryTest {

    @Test
    public void getType() {

        CardlessService s = CardlessServiceFactory.getType("...");
        System.out.println(s);
        Assert.assertNotNull(s.getType());
    }
}