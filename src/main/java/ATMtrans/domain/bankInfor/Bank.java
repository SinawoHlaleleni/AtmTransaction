package ATMtrans.domain.bankInfor;

public class Bank {

    private String Id, Name;

    private Bank() {
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    private Bank(Builder builder) {

        this.Id = builder.Id;
        this.Name = builder.Name;

    }

    public static class Builder {
        private String Id, Name;

        public Builder Id(String Id) {
            this.Id = Id;
            return this;
        }

        public Builder Name(String Name) {
            this.Name = Name;
            return this;
        }

        public Bank build() {
            return new Bank(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "Id='" + Id + '\'' +
                    ", Name='" + Name + '\'' +
                    '}';
        }
    }
}