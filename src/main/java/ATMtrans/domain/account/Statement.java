package ATMtrans.domain.account;

public class Statement {

    private String id, type;

    private Statement (){}

    private Statement(Builder builder){

        this.id= builder.id;
        this.type=builder.type;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public static class Builder{
        private String id, type;

        public Builder id(String id){
            this.id=id;
            return this;
        }

        public Builder type (String type){
            this.id=id;
            return this;
        }

        public Statement build(){
            return new Statement(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "id='" + id + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }
    }
}
