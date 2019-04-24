package ATMtrans.repository.impl;

import ATMtrans.domain.User;
import ATMtrans.repository.UserRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * An implementation (Singleton) of the interface


public class UserRepositoryImpl implements UserRepository {
    private static UserRepository repository = null;
    private Set<User> user;


        private UserRepositoryImpl() {
            this.user = new HashSet<>();
        }

        private User findStudent(String userId) {
            return this.user.stream().filter(user -> user.getUserId().equals(userId)).findAny().orElse(null);
        }

        public static UserRepository getRepository() {
            if (repository == null) repository = new UserRepositoryImpl();
            return repository;
        }


    @Override
        public User create(User user) {
            this.user.add(user);
            return user;
        }

        @Override
        public void delete(User user) {
            this.user.remove(user);
        }

        @Override
        public User read(final String userId) {
            return findUser(userId);
        }

        @Override
        public User update(User user) {
            // find the student to update in the student collection
            // if found, update and save back into the student collection
            return null;
        }

        public Set<User> getAll() {
            return this.user;
        }
    }
}
*/