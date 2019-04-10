package ATMtrans.domain;

import javafx.util.Builder;

public class atmTran {

    private String transId, typeOfTrans;


    private atmTran (){}

    private atmTran(Builder builder){

        this.transId= builder.transId;
        this.typeOfTrans=builder.typeOfTrans;
    }

    public String getTransId() {
        return transId;
    }

    public String getTypeOfTrans() {
        return typeOfTrans;
    }

    public static class Builder{
        private String transId, typeOfTrans;

        public Builder transId(String transId){
            this.transId=transId;
            return this;
        }

        public Builder typeOfTrans (String typeOfTrans){
            this.transId=transId;
            return this;
        }

        public atmTran build(){
            return new atmTran(this);
        }
    }

    @Override
    public String toString() {
        return "atmTran{" +
                "transId='" + transId + '\'' +
                ", typeOfTrans='" + typeOfTrans + '\'' +
                '}';
    }
}
