package ATMtrans.domain.atmInfor;

public class Atm {

    private String Id, Type;


    private Atm() {
    }

    public String getId() {
        return Id;
    }

    public String getType() {
        return Type;
    }

    private Atm(Builder builder) {

        this.Id = builder.Id;
        this.Type = builder.Type;

    }

    public static class Builder {
        private String Id, Type;

        public Builder Id(String Id) {
            this.Id = Id;
            return this;
        }

        public Builder Type(String Type) {
            this.Type = Type;
            return this;
        }

        public Atm build() {
            return new Atm(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "Id='" + Id + '\'' +
                    ", Type='" + Type + '\'' +
                    '}';
        }
    }
}