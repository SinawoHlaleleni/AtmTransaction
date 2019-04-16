package ATMtrans.orders;

public class CreditOrder implements DebitOrders {

    private double amount = 0;

    private CreditOrder() {
    }

    private CreditOrder(Builder builder) {
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

        public CreditOrder build() {
            return new CreditOrder(this) {

            };
        }
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "amount=R" + amount +
                '}';
    }
}
