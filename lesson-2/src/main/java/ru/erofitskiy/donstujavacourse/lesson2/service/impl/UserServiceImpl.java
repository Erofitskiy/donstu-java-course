package ru.erofitskiy.donstujavacourse.lesson2.service.impl;

import org.springframework.stereotype.Component;
import ru.erofitskiy.donstujavacourse.lesson2.dao.UserDao;
import ru.erofitskiy.donstujavacourse.lesson2.dto.user.ChangePasswordDto;
import ru.erofitskiy.donstujavacourse.lesson2.dto.user.CreateUserDto;
import ru.erofitskiy.donstujavacourse.lesson2.model.User;
import ru.erofitskiy.donstujavacourse.lesson2.service.UserService;

@Component
public class UserServiceImpl implements UserService {

    private final UserDao dao;

    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public User createUser(CreateUserDto requestBody) {
        return dao.create(requestBody.firstName(), requestBody.username(), requestBody.password());
    }

    @Override
    public User findById(String id) {
        return dao.findById(id);
    }

    @Override
    public User deleteById(String id){
        return dao.delete(id);
    }

    @Override
    public User changePassword(ChangePasswordDto dto) {
        User user = dao.findById(dto.id());
        if (user.getPassword().equals(dto.oldPassword())) {

        }


        return null;
    }
}
