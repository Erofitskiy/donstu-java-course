package ru.erofitskiy.donstujavacourse.lesson3.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.erofitskiy.donstujavacourse.lesson3.model.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {

}
