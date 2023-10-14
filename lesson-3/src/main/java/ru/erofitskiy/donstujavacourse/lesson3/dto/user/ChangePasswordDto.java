package ru.erofitskiy.donstujavacourse.lesson3.dto.user;

import com.fasterxml.jackson.annotation.JsonIgnore;

public record ChangePasswordDto(String id,
                                @JsonIgnore String oldPassword,
                                @JsonIgnore String newPassword) {
}
