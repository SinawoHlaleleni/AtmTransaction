package ATMtrans.domain.atmTransies;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class Deposit implements AtmTran {
    private double amount = 0;
    private Deposit() {
    }

    private Deposit(Builder builder) {
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

        public Builder copy(Deposit deposit){
            this.amount = deposit.amount;
            return this;
        }
        public Deposit build() {
            return new Deposit(this);
        }
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "amount=" + amount +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if(this ==obj)return true;
        if(obj == null|| getClass() !=obj.getClass()) return false;
        Deposit deposit = (Deposit) obj;
        return deposit.equals(deposit.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);        }

}
