package ATMtrans.domain;

import javafx.util.Builder;

public class Balance {

    private double amount = 5000;

private Balance(){}

    private Balance(Builder builder) {
        this.amount = builder.amount;
    }

    public double getAmount() {
        return amount;
    }

    public static class Builder {

        private double amount;


        public Builder amount( double amount) {
            this.amount =amount;
            return this;
        }

        public Balance build() {
            return new Balance(this);
        }

    @Override
    public String toString() {
        return "Balance{" +
                "amount=" + amount +
                '}';
    }
}}