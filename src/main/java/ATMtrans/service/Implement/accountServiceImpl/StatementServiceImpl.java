package ATMtrans.service.Implement.accountServiceImpl;

import ATMtrans.domain.account.Statement;
import ATMtrans.repository.Implement.accountImpl.StatementRepositoryImpl;
import ATMtrans.repository.repositoryAccount.StatementRepository;
import ATMtrans.service.accountService.StatementService;

import java.util.Set;

public class StatementServiceImpl implements StatementService {

    public static StatementServiceImpl service = null;
    private StatementRepository repository;
    private StatementServiceImpl(){
        this.repository= StatementRepositoryImpl.getRepository();
    }
    public StatementService getService(){
        if(service == null) service = new StatementServiceImpl();
        return service;
    }

    @Override
    public Set<Statement> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Statement create(Statement statement) {
        return this.repository.create(statement);
    }

    @Override
    public Statement update(Statement statement) {
        return this.repository.update(statement);
    }

    @Override
    public void delete(String s) {
    repository.delete(s);
    }

    @Override
    public Statement read(String s) {
        return this.repository.read(s);
    }
}
