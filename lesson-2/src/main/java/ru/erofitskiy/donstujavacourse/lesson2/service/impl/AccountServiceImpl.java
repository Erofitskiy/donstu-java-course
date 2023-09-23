package ru.erofitskiy.donstujavacourse.lesson2.service.impl;

import ru.erofitskiy.donstujavacourse.lesson2.dao.AccountDao;
import ru.erofitskiy.donstujavacourse.lesson2.dao.UserDao;
import ru.erofitskiy.donstujavacourse.lesson2.dao.impl.AccountDaoImpl;
import ru.erofitskiy.donstujavacourse.lesson2.dao.impl.UserDaoImpl;
import ru.erofitskiy.donstujavacourse.lesson2.exception.NotFoundException;
import ru.erofitskiy.donstujavacourse.lesson2.model.Account;
import ru.erofitskiy.donstujavacourse.lesson2.service.AccountService;

public class AccountServiceImpl implements AccountService {

    private final AccountDao accountDao = new AccountDaoImpl();
    private final UserDao userDao = new UserDaoImpl();

    @Override
    public Account create(String userId) {
        if (userDao.findById(userId) == null) {
            throw new NotFoundException();
        }
        return accountDao.create(userId);
    }

    @Override
    public Double getBalanceById(String accountId) {
        return accountDao.findById(accountId).getBalance();
    }
}
