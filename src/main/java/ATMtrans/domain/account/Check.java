package ATMtrans.domain.account;

public class Check implements Account{

    private double amount = 0;

    private Check(){}

    private Check(Builder builder) {
        this.amount = builder.amount;
    }

    public double getAmount() {
        return amount;
    }

    public static class Builder {

        private double amount;


        public Builder amount(double amount) {
            this.amount = amount;
            return this;
        }

        public Check build() {
            return new Check(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "amount=R" + amount +
                    '}';
        }
    }
    }
