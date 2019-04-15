package ATMtrans.orders;

public class DebitOrders {

    private String Id, Type;

    private DebitOrders (){}

    private DebitOrders(Builder builder){

        this.Id= builder.Id;
        this.Type=builder.Type;
    }

    public String getId() {
        return Id;
    }

    public String getType() {
        return Type;
    }

    public static class Builder{
        private String Id, Type;

        public Builder Id(String Id){
            this.Id=Id;
            return this;
        }

        public Builder Type (String Type){
            this.Id= Id;
            return this;
        }

        public DebitOrders build(){
            return new DebitOrders(this);
        }
    }

    @Override
    public String toString() {
        return "DebitOrders{" +
                "Id='" + Id + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }
}
