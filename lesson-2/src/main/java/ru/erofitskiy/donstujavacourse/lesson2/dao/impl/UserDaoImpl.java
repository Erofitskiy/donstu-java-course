package ru.erofitskiy.donstujavacourse.lesson2.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.erofitskiy.donstujavacourse.lesson2.dao.UserDao;
import ru.erofitskiy.donstujavacourse.lesson2.exception.NotFoundException;
import ru.erofitskiy.donstujavacourse.lesson2.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
@Scope("singleton")
public class UserDaoImpl implements UserDao {

    Map<String, User> repository = new HashMap<>();

    @Override
    public User create(String firstName, String username, String password) {
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setUsername(username);
        user.setFirstName(firstName);
        user.setPassword(password);
        repository.put(user.getId(), user);
        return user;
    }

    @Override
    public User findById(String id) {
        System.out.println(repository);
        User user = repository.get(id);
        if (user != null) {
            return user;
        }
        throw new NotFoundException();
    }

    @Override
    public User updatePassword(String id, String newPassword){
        if (repository.containsKey(id)) {
            User user = repository.get(id);
            user.setPassword(newPassword);
            return user;
        }
        throw new NotFoundException();
    }


    @Override
    public User delete(String id) {
        if (repository.containsKey(id)) {
            User user = repository.get(id);
            repository.remove(id);
            return user;
        }
        return null;
    }
}
