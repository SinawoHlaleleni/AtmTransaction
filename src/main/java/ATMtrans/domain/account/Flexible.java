package ATMtrans.domain.account;

public class Flexible {

    private double amount = 0;

    private Flexible() {
    }

    private Flexible(Builder builder) {
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

        public Flexible build() {
            return new Flexible(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "amount=R" + amount +
                    '}';
        }
    }
}