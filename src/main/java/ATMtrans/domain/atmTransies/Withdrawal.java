package ATMtrans.domain.atmTransies;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class Withdrawal implements AtmTran {

    private static double amount = 0;

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

        public Builder copy(Withdrawal withdrawal){
            this.amount = withdrawal.amount;
            return this;
        }
        public Withdrawal build() {
            return new Withdrawal(this);
        }
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
            Withdrawal withdrawal = (Withdrawal) obj;
            return withdrawal.equals(withdrawal.getAmount());
        }

        @Override
        public int hashCode() {
            return Objects.hash(amount);        }
    }
