package ru.erofitskiy.donstujavacourse.lesson2.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;


public record CreateUserDto(String firstName,
                            String username,
                            @JsonIgnore String password) {
}
