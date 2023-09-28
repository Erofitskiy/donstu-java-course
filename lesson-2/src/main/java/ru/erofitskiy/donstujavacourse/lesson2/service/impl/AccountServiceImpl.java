package ru.erofitskiy.donstujavacourse.lesson2.service.impl;

import org.springframework.stereotype.Service;
import ru.erofitskiy.donstujavacourse.lesson2.dao.AccountDao;
import ru.erofitskiy.donstujavacourse.lesson2.dao.UserDao;
import ru.erofitskiy.donstujavacourse.lesson2.dao.impl.AccountDaoImpl;
import ru.erofitskiy.donstujavacourse.lesson2.dao.impl.UserDaoImpl;
import ru.erofitskiy.donstujavacourse.lesson2.exception.NotFoundException;
import ru.erofitskiy.donstujavacourse.lesson2.model.Account;
import ru.erofitskiy.donstujavacourse.lesson2.service.AccountService;

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
        return accountDao.findById(accountId).getBalance();
    }

    @Override
    public Account findById(String accountId) {
        return accountDao.findById(accountId);
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
