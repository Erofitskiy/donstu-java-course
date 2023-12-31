package ru.erofitskiy.donstujavacourse.lesson2.dto.user;

import com.fasterxml.jackson.annotation.JsonIgnore;

public record ChangePasswordDto(String id,
                                @JsonIgnore String oldPassword,
                                @JsonIgnore String newPassword) {
}
