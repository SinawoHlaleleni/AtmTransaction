package ATMtrans.repository.Implement.atmInforImpl;

import ATMtrans.domain.atmInfor.CashTransfer;
import ATMtrans.repository.repositoryAtmInf.CashTranferRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CashTranferRepositoryImpl implements CashTranferRepository {
    public static CashTranferRepositoryImpl repository = null;
    private Map<Double, CashTransfer> CashTransferTable;

    private CashTranferRepositoryImpl() {
        CashTransferTable = new HashMap<Double, CashTransfer>();
    }

    public static CashTranferRepository getRepository(){
        if (repository == null) repository = new CashTranferRepositoryImpl();
        return repository;
    }

    @Override
    public Set<CashTransfer> getAll() {
        return null;
    }

    @Override
    public CashTransfer create(CashTransfer cashTransfer) {

        CashTransferTable.put(CashTransfer.getAmount(),cashTransfer);
        CashTransfer cashTransfer1 = CashTransferTable.get(CashTransfer.getAmount());
        return cashTransfer1;
    }

    @Override
    public CashTransfer update(CashTransfer cashTransfer) {

        CashTransferTable.put(CashTransfer.getAmount(),cashTransfer);
        CashTransfer cashTransfer1 = CashTransferTable.get(CashTransfer.getAmount());
        return cashTransfer1;
    }

    @Override
    public void delete(Double aDouble) {
        CashTransferTable.remove(aDouble);

    }

    @Override
    public CashTransfer read(Double aDouble) {
        CashTransfer cashTransfer = CashTransferTable.get(aDouble);
        return cashTransfer;
    }
}
