package ATMtrans.domain.atmTransies;

import java.util.Set;

public class User /*implements comparable<User>*/ {

    private String userId;
    private static String userName;
    private String userPassword;
    private Set<AtmTran> transactions;

    private User(){}

    private User(Builder builder) {
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.userPassword = builder.userPassword;
    }

    public String getUserId() {
        return userId;
    }

    public static String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }


    public static class Builder {

        private String userId, userName, userPassword;
        private Set<AtmTran> transactions;

        public Builder userId( String userId) {
            this.userId = userId;
            return this;
        }

        public Builder userName( String userName) {
            this.userName = userName;
            return this;
        }

        public Builder userPassword( String userPassword) {
            this.userPassword = userPassword;
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
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", transactions=" + transactions +
                '}';
    }

}
