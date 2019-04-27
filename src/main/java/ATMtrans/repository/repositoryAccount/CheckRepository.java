package ATMtrans.repository.repositoryAccount;

import ATMtrans.domain.account.Check;
import ATMtrans.repository.IRepository.IRepository;

import java.util.Set;

public interface CheckRepository extends IRepository<Check,String> {
    Set<Check>getAll();
}
