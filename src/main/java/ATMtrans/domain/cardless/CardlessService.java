package ATMtrans.domain.cardless;

public class CardlessService {

    private String Id, Type;


    private CardlessService() {
    }

    public String getId() {
        return Id;
    }

    public String getType() {
        return Type;
    }

    private CardlessService(Builder builder) {

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

        public CardlessService build() {
            return new CardlessService(this);
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

