package ATMtrans.domain;

import java.util.Set;

public class User {


    private String userId, userFirstName, userLastName;
    private Set<AtmTran> transactions;

    private User(){}

    private User(Builder builder) {
        this.userId = builder.userId;
        this.userFirstName = builder.userFirstName;
        this.userLastName = builder.userLastName;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }


    public static class Builder {

        private String userId, userFirstName, userLastName;
        private Set<AtmTran> transactions;

        public Builder userId( String userId) {
            this.userId = userId;
            return this;
        }

        public Builder userFirstName( String userFirstName) {
            this.userFirstName = userFirstName;
            return this;
        }

        public Builder userLastName( String userLastName) {
            this.userLastName = userLastName;
            return this;
        }


        public User build() {
            return new User(this);
        }

    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userFirstName='" + userFirstName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}
