package ru.erofitskiy.donstujavacourse.lesson3.service;

import ru.erofitskiy.donstujavacourse.lesson3.model.Account;

public interface AccountService {

    Account create(String userId);

    Account findById(String accountId);

    Account updateBalance(String accountId, Double amount);

    Double getBalanceById(String accountId);

    Account delete(String accountId);

}
