package ATMtrans.domain.atmInfor;

public class Electricity {

    private String Id, MeterNum;
    private static double Amount;

    private Electricity() {
    }

    public String getId() {
        return Id;
    }

    public String getMeterNum() {
        return MeterNum;
    }

    public static double getAmount() {
        return Amount;
    }

    private Electricity(Builder builder) {

        this.Id = builder.Id;
        this.MeterNum = builder.MeterNum;
        this.Amount = builder.Amount;
    }

    public static class Builder {
        private String Id, MeterNum;
        private double Amount;

        public Builder Id(String Id) {
            this.Id = Id;
            return this;
        }

        public Builder MeterNum(String MeterNum) {
            this.MeterNum = MeterNum;
            return this;
        }

        public Builder Amount(double Amount) {
            this.Amount = Amount;
            return this;
        }

        public Electricity build() {
            return new Electricity(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "Id='" + Id + '\'' +
                    ", MeterNum='" + MeterNum + '\'' +
                    ", Amount=R" + Amount +
                    '}';
        }
    }
}