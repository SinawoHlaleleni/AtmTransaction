package ATMtrans.account;

public class Account {

    private String accId, accType;

    private Account (){}

    private Account(Builder builder){

        this.accId= builder.accId;
        this.accType=builder.accType;
    }

    public String getAccId() {
        return accId;
    }

    public String getAccType() {
        return accType;
    }

    public static class Builder{
        private String accId, accType;

        public Builder accId(String accId){
            this.accId=accId;
            return this;
        }

        public Builder accType (String accType){
            this.accId= accId;
            return this;
        }

        public Account build(){
            return new Account(this);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accId='" + accId + '\'' +
                ", accType='" + accType + '\'' +
                '}';
    }
}
