package ATMtrans.account;

public class Savings implements Account {

    private double amount = 5000;

    private Savings() {
    }

    private Savings(Builder builder) {
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

        public Savings build() {
            return new Savings(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "amount=R" + amount +
                    '}';
        }
    }
}
