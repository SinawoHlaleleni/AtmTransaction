package ATMtrans.domain.orders;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class CreditOrder implements DebitOrders {

    private double amount = 0;

    private CreditOrder() {
    }

    private CreditOrder(Builder builder) {
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

        public Builder copy(CreditOrder creditOrder){
            this.amount = creditOrder.amount;
            return this;
        }

        public CreditOrder build() {
            return new CreditOrder(this);}
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
        CreditOrder creditOrder = (CreditOrder) obj;
        return creditOrder.equals(creditOrder.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);        }
}
