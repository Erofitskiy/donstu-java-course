package ru.erofitskiy.donstujavacourse.lesson3.dto.user;

import com.fasterxml.jackson.annotation.JsonIgnore;


public record CreateUserDto(String firstName,
                            String username,
                            String password) {
}
