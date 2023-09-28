package ru.erofitskiy.donstujavacourse.lesson2.dto.user;

import com.fasterxml.jackson.annotation.JsonIgnore;


public record CreateUserDto(String firstName,
                            String username,
                            String password) {
}
