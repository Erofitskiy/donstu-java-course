package ru.erofitskiy.donstujavacourse.lesson2.controller;

import org.springframework.web.bind.annotation.*;
import ru.erofitskiy.donstujavacourse.lesson2.CreateUserDto;
import ru.erofitskiy.donstujavacourse.lesson2.dao.UserDao;
import ru.erofitskiy.donstujavacourse.lesson2.model.User;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    private final UserDao dao;

    public UserController(UserDao dao) {
        this.dao = dao;
    }

    @PostMapping
    public User createUser(@RequestBody CreateUserDto requestBody) {
        System.out.println(requestBody);
        return dao.create(requestBody.firstName(), requestBody.username(), requestBody.password());
    }


    @GetMapping(path = "/{id}", produces = "application/json")
    public User findById(@PathVariable(value = "id") String id) {
        return dao.findById(id);
    }

}
