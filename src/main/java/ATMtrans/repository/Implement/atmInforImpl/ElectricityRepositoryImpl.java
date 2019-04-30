package ATMtrans.repository.Implement.atmInforImpl;

import ATMtrans.domain.account.Account;
import ATMtrans.domain.atmInfor.Electricity;
import ATMtrans.repository.repositoryAtmInf.ElectricityRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ElectricityRepositoryImpl implements ElectricityRepository {
    public static ElectricityRepositoryImpl repository = null;
    private Map<Double,Electricity> ElectricityTable;

    private ElectricityRepositoryImpl() {
        ElectricityTable = new HashMap<>();
    }

    public static ElectricityRepository getRepository() {
        if (repository == null) repository = new ElectricityRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Electricity> getAll() {
        return this.getAll();
    }

    @Override
    public Electricity create(Electricity electricity) {

        ElectricityTable.put(Electricity.getAmount(),electricity);
        Electricity electricity1 = ElectricityTable.get(Electricity.getAmount());
        return electricity1;

    }

    @Override
    public Electricity update(Electricity electricity) {

        ElectricityTable.put(Electricity.getAmount(),electricity);
        Electricity electricity1 = ElectricityTable.get(Electricity.getAmount());
        return electricity1;

    }

    @Override
    public Account delete(String s) {
        //ElectricityTable.remove(s);

        return this.delete(s);
    }

    @Override
    public Electricity read(String s) {
        Electricity electricity = ElectricityTable.get(s);
        return electricity;
    }
}
