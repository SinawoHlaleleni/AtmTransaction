package ATMtrans.atmInfor;

public class Topup {

    private String Id, Type;


    private Topup (){}

    public String getId() {
        return Id;
    }

    public String getType() {
        return Type;
    }

    private Topup (Builder builder){

        this.Id= builder.Id;
        this.Type=builder.Type;

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

        public Topup build() {
            return new Topup(this);
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
