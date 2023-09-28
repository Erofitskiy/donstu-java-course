package ru.erofitskiy.donstujavacourse.lesson2.service;

import ru.erofitskiy.donstujavacourse.lesson2.dto.user.ChangePasswordDto;
import ru.erofitskiy.donstujavacourse.lesson2.dto.user.CreateUserDto;
import ru.erofitskiy.donstujavacourse.lesson2.model.User;

public interface UserService {
    User createUser(CreateUserDto requestBody);

    User findById(String id);

    User deleteById(String id);

    User changePassword(ChangePasswordDto dto);
}
