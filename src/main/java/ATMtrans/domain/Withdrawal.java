package ATMtrans.domain;

public class Withdrawal {

    private double amount = 0;

    private Withdrawal() {
    }

    private Withdrawal(Builder builder) {
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

        public Withdrawal build() {
            return new Withdrawal(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "amount=" + amount +
                    '}';
        }
    }
}