package ATMtrans.atmInfor;

public class CashLimit {

    private String Id ;
    private double Amount;

    private CashLimit (){}

    public String getId() {
        return Id;
    }

    public double getAmount() {
        return Amount;
    }

    private CashLimit(Builder builder){

        this.Id= builder.Id;
        this.Amount=builder.Amount;
    }

    public static class Builder {
        private String Id;
        private double Amount;

        public Builder Id(String Id) {
            this.Id = Id;
            return this;
        }

        public Builder Amount(double Amount) {
            this.Amount = Amount;
            return this;
        }

        public CashLimit build() {
            return new CashLimit(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "Id='" + Id + '\'' +
                    ", Amount=R " + Amount +
                    '}';
        }
    }}
