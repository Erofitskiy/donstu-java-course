package ru.erofitskiy.donstujavacourse.lesson2.service;

import org.springframework.web.bind.annotation.PathVariable;
import ru.erofitskiy.donstujavacourse.lesson2.dto.ChangePasswordDto;
import ru.erofitskiy.donstujavacourse.lesson2.dto.CreateUserDto;
import ru.erofitskiy.donstujavacourse.lesson2.model.User;

public interface UserService {
    User createUser(CreateUserDto requestBody);

    User findById(String id);

    User deleteById(String id);

    User changePassword(ChangePasswordDto dto);
}
