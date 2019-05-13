package ATMtrans.domain.account;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class Fixed implements Account{

    private static double amount = 0;

    private Fixed(){}

    private Fixed(Builder builder) {
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

        public Builder copy(Fixed fixed){
            this.amount = fixed.amount;
            return this;
        }

        public Fixed build() {
            return new Fixed(this);
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
            Fixed fixed = (Fixed)obj;
            return fixed.equals(((Fixed) obj).getAmount());
        }

        @Override
        public int hashCode() {
            return Objects.hash(amount);
        }
    }

