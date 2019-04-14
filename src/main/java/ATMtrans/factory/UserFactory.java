package ATMtrans.factory;

import ATMtrans.domain.User;
import ATMtrans.util.Misc;

public class UserFactory {

    public static User getUser(String firstName, String lastName) {
        return new User.Builder()
                .userFirstName(firstName)
                .userLastName(lastName)
                .userId(Misc.generateId())
                .build();
    }

}
