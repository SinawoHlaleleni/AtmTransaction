package ATMtrans.cardless;

public class CardlessWithdrawal {

    private double amount = 0;

    private CardlessWithdrawal() {
    }

    private CardlessWithdrawal(Builder builder) {
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

        public CardlessWithdrawal build() {
            return new CardlessWithdrawal(this);
        }
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "amount=R" + amount +
                '}';
    }
}
