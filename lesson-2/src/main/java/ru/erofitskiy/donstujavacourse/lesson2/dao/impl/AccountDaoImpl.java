package ru.erofitskiy.donstujavacourse.lesson2.dao.impl;

import org.springframework.stereotype.Component;
import ru.erofitskiy.donstujavacourse.lesson2.dao.AccountDao;
import ru.erofitskiy.donstujavacourse.lesson2.exception.NotFoundException;
import ru.erofitskiy.donstujavacourse.lesson2.model.Account;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class AccountDaoImpl implements AccountDao {

    Map<String, Account> repository = new HashMap<>();

    @Override
    public Account create(String userId) {
        Account account = new Account();
        account.setId(UUID.randomUUID().toString());
        account.setUserId(userId);
        account.setBalance(0.0d);
        repository.put(account.getId(), account);
        return account;
    }

    @Override
    public Account findByUserId(String userId) {
        Account result = null;
        for (Map.Entry<String, Account> entry : repository.entrySet()) {
            if (entry.getValue().getUserId().equals(userId)) {
                result = entry.getValue();
                break;
            }
        }
        if (result != null) {
            return result;
        }
        throw new NotFoundException();
    }

    @Override
    public Account findById(String id) {
        Account account = repository.get(id);
        if (account == null) {
            throw new NotFoundException();
        }
        return account;
    }

    @Override
    public Account setBalance(String accountId, double amount) {
        Account account = findById(accountId);
        account.setBalance(amount);
        return account;
    }

    @Override
    public Account delete(String accountId) {
        return repository.remove(accountId);
    }
}
