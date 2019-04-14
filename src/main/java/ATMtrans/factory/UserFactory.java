package ATMtrans.factory;

import ATMtrans.domain.User;
import ATMtrans.util.Misc;

public class UserFactory {

    public static User getUser(String userName, String userPassword) {
        return new User.Builder()
                .userName(userName)
                .userPassword(userPassword)
                .userId(Misc.generateId())
                .build();
    }

}
