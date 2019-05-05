package ATMtrans.domain.account;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
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

        @Override
        public boolean equals(Object obj) {
            if(this ==obj)return true;
            if(obj == null|| getClass() !=obj.getClass()) return false;
            Savings savings = (Savings) obj;
            return savings.equals(((Savings) obj).getAmount());
        }

        @Override
        public int hashCode() {
            return Objects.hash(amount);
        }
    }
}
