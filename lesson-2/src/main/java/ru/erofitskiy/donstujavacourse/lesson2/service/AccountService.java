package ru.erofitskiy.donstujavacourse.lesson2.service;

import ru.erofitskiy.donstujavacourse.lesson2.model.Account;

public interface AccountService {

    Account create(String userId);

    Double getBalanceById(String accountId);

}
