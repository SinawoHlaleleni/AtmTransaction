package ATMtrans.domain;

public class Deposit implements AtmTran {
    private double amount = 0;
    private Deposit() {
    }

    private Deposit(Builder builder) {
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

        public Deposit build() {
            return new Deposit(this);
        }
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "amount=" + amount +
                '}';
    }
}
