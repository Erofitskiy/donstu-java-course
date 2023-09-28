package ru.erofitskiy.donstujavacourse.lesson2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.erofitskiy.donstujavacourse.lesson2.dto.user.ChangePasswordDto;
import ru.erofitskiy.donstujavacourse.lesson2.dto.user.CreateUserDto;
import ru.erofitskiy.donstujavacourse.lesson2.exception.NotFoundException;
import ru.erofitskiy.donstujavacourse.lesson2.model.User;
import ru.erofitskiy.donstujavacourse.lesson2.service.UserService;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody CreateUserDto requestBody) {
        return new ResponseEntity<>(service.createUser(requestBody), HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    public ResponseEntity<User> findById(@PathVariable(value = "id") String id) {
        try {
            return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
        } catch (NotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<User> changePassword(@RequestBody ChangePasswordDto dto){
        try {
            return new ResponseEntity<>(service.changePassword(dto), HttpStatus.OK);
        } catch (NotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<User> deleteUser(@PathVariable(value = "id") String id) {
        return new ResponseEntity<>(service.deleteById(id), HttpStatus.OK);
    }

}
