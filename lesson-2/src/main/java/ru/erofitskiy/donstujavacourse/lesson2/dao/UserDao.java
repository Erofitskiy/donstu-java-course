package ru.erofitskiy.donstujavacourse.lesson2.dao;

import ru.erofitskiy.donstujavacourse.lesson2.model.User;

public interface UserDao {

    User create(String firstName, String username, String password);

    User findById(String id);

    //User update(String username, char[] password);

    User delete();


}
