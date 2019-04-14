package ATMtrans.factory;

import ATMtrans.domain.AtmTran;
import ATMtrans.util.Misc;

public class AtmTranFactory {

    public static AtmTran getAtmTran(String typeOfTrans){

        return new AtmTran.Builder()
                .transId(Misc.generateId())
                .typeOfTrans(typeOfTrans)
                .build();
    }

}
