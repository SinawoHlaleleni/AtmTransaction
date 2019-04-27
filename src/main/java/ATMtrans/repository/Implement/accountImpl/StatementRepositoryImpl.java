package ATMtrans.repository.Implement.accountImpl;

import ATMtrans.domain.account.Statement;
import ATMtrans.repository.repositoryAccount.StatementRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StatementRepositoryImpl implements StatementRepository {

    public static StatementRepositoryImpl repository = null;
    private Map<String, Statement> StatementTable;

    private StatementRepositoryImpl() {
        StatementTable = new HashMap<String, Statement>();
    }

    public static StatementRepository getRepository(){
        if (repository == null) repository = new StatementRepositoryImpl();
        return repository;
    }

    @Override
    public Set<Statement> getAll() {
        return null;
    }

    @Override
    public Statement create(Statement statement) {

        StatementTable.put(Statement.getType(),statement);
        Statement statement1 = StatementTable.get(Statement.getType());
        return statement1;
    }

    @Override
    public Statement update(Statement statement) {
        StatementTable.put(Statement.getType(),statement);
        Statement statement1 = StatementTable.get(Statement.getType());
        return statement1;
    }

    @Override
    public void delete(String s) {
        StatementTable.remove(s);

    }

    @Override
    public Statement read(String s) {
        Statement statement = StatementTable.get(s);
        return statement;
    }
}
