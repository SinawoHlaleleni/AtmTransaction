package ATMtrans.domain.account;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class Check implements Account{

    private double amount = 0;

    private Check(){}

    private Check(Builder builder) {
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

        public Builder copy(Check check){
            this.amount = check.amount;
            return this;
        }

        public Check build() {
            return new Check(this);
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
            Check check = (Check) obj;
            return check.equals(((Check) obj).getAmount());
        }

        @Override
        public int hashCode() {
            return Objects.hash(amount);        }
    }

