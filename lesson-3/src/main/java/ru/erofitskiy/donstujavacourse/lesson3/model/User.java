package ru.erofitskiy.donstujavacourse.lesson2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.ToString;

@ToString
public class User {
    private String id;
    private String firstName;

    private String username;
    @JsonIgnore
    private String password;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
