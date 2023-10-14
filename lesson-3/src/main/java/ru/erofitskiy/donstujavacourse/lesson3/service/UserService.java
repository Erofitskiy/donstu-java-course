package ru.erofitskiy.donstujavacourse.lesson3.service;

import ru.erofitskiy.donstujavacourse.lesson3.dto.user.ChangePasswordDto;
import ru.erofitskiy.donstujavacourse.lesson3.dto.user.CreateUserDto;
import ru.erofitskiy.donstujavacourse.lesson3.model.User;

public interface UserService {
    User createUser(CreateUserDto requestBody);

    User findById(String id);

    User deleteById(String id);

    User changePassword(ChangePasswordDto dto);
}
