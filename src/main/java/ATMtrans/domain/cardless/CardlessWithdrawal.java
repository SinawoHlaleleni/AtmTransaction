package ATMtrans.domain.cardless;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
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
        public Builder copy(CardlessWithdrawal cardlessWithdrawal){
            this.amount = cardlessWithdrawal.amount;
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

    @Override
    public boolean equals(Object obj) {
        if(this ==obj)return true;
        if(obj == null|| getClass() !=obj.getClass()) return false;
        CardlessWithdrawal cardlessWithdrawal = (CardlessWithdrawal) obj;
        return cardlessWithdrawal.equals(cardlessWithdrawal.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);        }
}
