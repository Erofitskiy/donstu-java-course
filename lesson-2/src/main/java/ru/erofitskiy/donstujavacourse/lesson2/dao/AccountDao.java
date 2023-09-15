package ru.erofitskiy.donstujavacourse.lesson2.dao;

import ru.erofitskiy.donstujavacourse.lesson2.model.Account;

public interface AccountDao {
    Account create(String userId);

    Account findByUserId(String userId);

    Account findById(String id);

    void changeBalance(double amount);

    boolean delete();


}
