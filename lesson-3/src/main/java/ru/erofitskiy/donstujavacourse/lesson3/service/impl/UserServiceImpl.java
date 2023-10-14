package ru.erofitskiy.donstujavacourse.lesson3.service.impl;

import org.springframework.stereotype.Component;
import ru.erofitskiy.donstujavacourse.lesson3.dao.UserDao;
import ru.erofitskiy.donstujavacourse.lesson3.dto.user.ChangePasswordDto;
import ru.erofitskiy.donstujavacourse.lesson3.dto.user.CreateUserDto;
import ru.erofitskiy.donstujavacourse.lesson3.model.User;
import ru.erofitskiy.donstujavacourse.lesson3.service.UserService;

@Component
public class UserServiceImpl implements UserService {

    private final UserDao dao;

    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public User createUser(CreateUserDto requestBody) {
        // здесь могла бы быть ваша реклама
        return dao.save(User.builder()
                .withFirstName(requestBody.firstName())
                .withUsername(requestBody.username())
                .withPassword(requestBody.password())
                .build()
        );
    }

    @Override
    public User findById(String id) {
        return dao.findById(id).get();
    }

    @Override
    public User deleteById(String id) {
        User user = dao.findById(id).get();
        dao.deleteById(id);
        return user;
    }

    @Override
    public User changePassword(ChangePasswordDto dto) {
        User user = dao.findById(dto.id()).get();
        if (user.getPassword().equals(dto.oldPassword())) {
            user.setPassword(dto.newPassword());
            dao.save(user);
            return user;
        } else {
            throw new RuntimeException("Неверный пароль");
        }

    }
}
