package ATMtrans.factory;

import ATMtrans.domain.atmTran;
import ATMtrans.util.Misc;

public class atmTranFactory {

    public static atmTran getAtmTran(String typeOfTrans){

        return new atmTran.Builder().transId(Misc.generateId())
                .typeOfTrans(typeOfTrans)
                .build();
    }

}
