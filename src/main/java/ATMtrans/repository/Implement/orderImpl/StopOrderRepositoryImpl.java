package ATMtrans.repository.Implement.orderImpl;

import ATMtrans.domain.orders.StopOrder;
import ATMtrans.repository.repositoryOrder.StopOrderRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StopOrderRepositoryImpl implements StopOrderRepository {
    public static StopOrderRepositoryImpl repository = null;
    private Map<Double, StopOrder> StopOrderTable;

    private StopOrderRepositoryImpl() {
        StopOrderTable = new HashMap<>();
    }

    public static StopOrderRepository getRepository(){
        if (repository == null) repository = new StopOrderRepositoryImpl();
        return repository;
    }

    @Override
    public Set<StopOrder> getAll() {
        return this.getAll();
    }

    @Override
    public StopOrder create(StopOrder stopOrder) {
        StopOrderTable.put(stopOrder.getAmount(),stopOrder);
        StopOrder creditOrder1 = StopOrderTable.get(stopOrder.getAmount());
        return creditOrder1;
    }

    @Override
    public StopOrder update(StopOrder stopOrder) {
        StopOrderTable.put(stopOrder.getAmount(),stopOrder);
        StopOrder creditOrder1 = StopOrderTable.get(stopOrder.getAmount());
        return creditOrder1;
    }

    @Override
    public void delete(Double aDouble) {
        StopOrderTable.remove(aDouble);
        //return this.delete(aDouble);
    }

    @Override
    public StopOrder read(Double aDouble) {
        StopOrder  stopOrder = StopOrderTable.get(aDouble);
        return stopOrder;
    }
}
