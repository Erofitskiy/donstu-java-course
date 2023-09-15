package ru.erofitskiy.donstujavacourse.lesson2.dao.impl;

import ru.erofitskiy.donstujavacourse.lesson2.dao.AccountDao;
import ru.erofitskiy.donstujavacourse.lesson2.exception.NotFoundException;
import ru.erofitskiy.donstujavacourse.lesson2.model.Account;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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
        Account result = repository.get(userId);

        if (result != null) {
            return result;
        }
        throw new NotFoundException();
    }

    @Override
    public Account findById(String id) {
        return null;
    }

    @Override
    public void changeBalance(double amount) {

    }

    @Override
    public boolean delete() {
        return false;
    }


}
