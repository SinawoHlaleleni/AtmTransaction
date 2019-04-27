package ATMtrans.repository.Implement.orderImpl;

import ATMtrans.domain.orders.CreditOrder;
import ATMtrans.repository.repositoryOrder.CreditOrderRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CreditOrderRepositoryImpl implements CreditOrderRepository {

    public static CreditOrderRepositoryImpl repository = null;
    private Map<Double, CreditOrder> CreditOrderTable;

    private CreditOrderRepositoryImpl() {
        CreditOrderTable = new HashMap<Double,CreditOrder>();
    }

    public static CreditOrderRepository getRepository(){
        if (repository == null) repository = new CreditOrderRepositoryImpl();
        return repository;
    }


    @Override
    public Set<CreditOrder> getAll() {
        return null;
    }

    @Override
    public CreditOrder create(CreditOrder creditOrder) {

        CreditOrderTable.put(creditOrder.getAmount(),creditOrder);
        CreditOrder creditOrder1 = CreditOrderTable.get(creditOrder.getAmount());
        return creditOrder1;

    }

    @Override
    public CreditOrder update(CreditOrder creditOrder) {
        CreditOrderTable.put(creditOrder.getAmount(),creditOrder);
        CreditOrder creditOrder1 = CreditOrderTable.get(creditOrder.getAmount());
        return creditOrder1;
    }

    @Override
    public void delete(Double aDouble) {
        CreditOrderTable.remove(aDouble);

    }

    @Override
    public CreditOrder read(Double aDouble) {
        CreditOrder creditOrder = CreditOrderTable.get(aDouble);
        return creditOrder;
    }
}
