package ATMtrans.domain.orders;

public class StopOrder implements DebitOrders {

    private double amount = 0;

    private StopOrder() {
    }

    private StopOrder(Builder builder) {
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

        public StopOrder build() {
            return new StopOrder(this) {

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
