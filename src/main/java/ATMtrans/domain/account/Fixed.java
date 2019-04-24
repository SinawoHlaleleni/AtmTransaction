package ATMtrans.domain.account;

public class Fixed implements Account{
    private double amount = 0;

    private Fixed(){}

    private Fixed(Builder builder) {
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

        public Fixed build() {
            return new Fixed(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "amount=R" + amount +
                    '}';
        }
    }
    }
