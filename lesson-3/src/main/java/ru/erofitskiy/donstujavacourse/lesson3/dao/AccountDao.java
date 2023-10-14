package ru.erofitskiy.donstujavacourse.lesson3.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.erofitskiy.donstujavacourse.lesson3.model.Account;


@Repository
public interface AccountDao extends CrudRepository<Account, String> {
    Account create(String userId);

    Account findByUserId(String userId);

//    Account findById(String id);

    Account setBalance(String accountId, double amount);

//    Account delete(String accountId);


}
