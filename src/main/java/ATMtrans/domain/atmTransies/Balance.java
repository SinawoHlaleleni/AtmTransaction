package ATMtrans.domain.atmTransies;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class Balance implements AtmTran {

    private static double amount = 5000;

private Balance(){}

    private Balance(Builder builder) {
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

        public Builder copy(Balance balance){
            this.amount = balance.amount;
            return this;
        }

        public Balance build() {
            return new Balance(this);
        }
    }
    @Override
    public String toString() {
        return "Balance{" +
                "amount=R" + amount +
                '}';
    }
        @Override
        public boolean equals(Object obj) {
            if(this ==obj)return true;
            if(obj == null|| getClass() !=obj.getClass()) return false;
            Balance balance = (Balance) obj;
            return balance.equals(balance.getAmount());
        }

        @Override
        public int hashCode() {
            return Objects.hash(amount);        }
}
