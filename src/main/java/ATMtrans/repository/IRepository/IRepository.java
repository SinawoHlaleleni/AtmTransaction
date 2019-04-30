package ATMtrans.repository.IRepository;

import ATMtrans.domain.account.Account;

public interface IRepository<T, ID> {

   T create(T t);
    T update(T t);
    Account delete(ID id);
    T read(ID id);
}
