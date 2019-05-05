package ATMtrans.domain.account;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
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


        @Override
        public boolean equals(Object obj) {
            if(this ==obj)return true;
            if(obj == null|| getClass() !=obj.getClass()) return false;
            Flexible flexible = (Flexible) obj;
            return flexible.equals(((Flexible) obj).getAmount());
        }


        @Override
        public int hashCode() {
            return Objects.hash(amount);
        }


    }
}