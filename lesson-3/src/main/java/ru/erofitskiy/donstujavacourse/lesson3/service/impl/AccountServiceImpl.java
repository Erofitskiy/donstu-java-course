package ru.erofitskiy.donstujavacourse.lesson3.service.impl;

import org.springframework.stereotype.Service;
import ru.erofitskiy.donstujavacourse.lesson3.dao.AccountDao;
import ru.erofitskiy.donstujavacourse.lesson3.dao.UserDao;
import ru.erofitskiy.donstujavacourse.lesson3.exception.NotFoundException;
import ru.erofitskiy.donstujavacourse.lesson3.model.Account;
import ru.erofitskiy.donstujavacourse.lesson3.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountDao accountDao;
    private final UserDao userDao;

    public AccountServiceImpl(AccountDao accountDao, UserDao userDao) {
        this.accountDao = accountDao;
        this.userDao = userDao;
    }

    @Override
    public Account create(String userId) {
        if (userDao.findById(userId) == null) {
            throw new NotFoundException();
        }
        return accountDao.create(userId);
    }

    @Override
    public Double getBalanceById(String accountId) {
        return accountDao.findById(accountId).get().getBalance();
    }

    @Override
    public Account findById(String accountId) {
        return accountDao.findById(accountId).get();
    }

    @Override
    public Account updateBalance(String accountId, Double amount) {
        Account account = findById(accountId);
        double oldBalance = account.getBalance();
        account.setBalance(oldBalance + amount);
        return account;
    }

    @Override
    public Account delete(String accountId) {
        return null;
    }
}
