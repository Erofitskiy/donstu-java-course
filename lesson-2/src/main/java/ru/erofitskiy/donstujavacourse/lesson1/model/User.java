package ru.erofitskiy.donstujavacourse.lesson1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {
    private String id;
    private String firstName;

    private String username;
    private String password;

}
