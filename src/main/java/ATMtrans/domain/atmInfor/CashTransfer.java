package ATMtrans.domain.atmInfor;

public class CashTransfer {

    private String Id, num;
    private static double Amount;

    private CashTransfer (){}

    public String getId() {
        return Id;
    }

    public String getNum() {
        return num;
    }

    public static double getAmount() {
        return Amount;
    }

    private CashTransfer(Builder builder){

        this.Id= builder.Id;
        this.num=builder.num;
        this.Amount=builder.Amount;
    }

    public static class Builder {
        private String Id, num;
        private double Amount;

        public Builder Id(String Id) {
            this.Id = Id;
            return this;
        }

        public Builder num(String num) {
            this.num = num;
            return this;
        }

        public Builder Amount(double Amount) {
            this.Amount = Amount;
            return this;
        }

        public CashTransfer build() {
            return new CashTransfer(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "Id='" + Id + '\'' +
                    ", num='" + num + '\'' +
                    ", Amount= R" + Amount +
                    '}';
        }
    }
    }
