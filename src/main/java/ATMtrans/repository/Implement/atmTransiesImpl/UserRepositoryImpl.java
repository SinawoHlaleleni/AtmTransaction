package ATMtrans.repository.Implement.atmTransiesImpl;

import ATMtrans.domain.account.Account;
import ATMtrans.domain.atmTransies.User;
import ATMtrans.repository.repositoryAtmTransies.UserRepository;

import java.util.HashMap;
import java.util.Set;

public class UserRepositoryImpl implements UserRepository {

    public static UserRepositoryImpl repository = null;
    private HashMap<String, User> UserTable;

    private UserRepositoryImpl() {
        UserTable = new HashMap<String, User>();
    }

    public static UserRepository getRepository(){
        if (repository == null) repository = new UserRepositoryImpl();
        return repository;
    }

    @Override
    public Set<User> getAll() {
        return this.getAll();
    }

    @Override
    public User create(User user) {

        UserTable.put(User.getUserName(),user);
        User user1 = UserTable.get(User.getUserName());
        return user1;

    }

    @Override
    public User update(User user) {
        UserTable.put(User.getUserName(),user);
        User user1 = UserTable.get(User.getUserName());
        return user1;

    }

    @Override
    public Account delete(String s) {
        UserTable.remove(s);

        return null;
    }

    @Override
    public User read(String s)
    {
        User user = UserTable.get(s);
        return user;
    }
}
