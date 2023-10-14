package ru.erofitskiy.donstujavacourse.lesson2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.erofitskiy.donstujavacourse.lesson2.dto.account.CreateAccountDto;
import ru.erofitskiy.donstujavacourse.lesson2.dto.account.GetBalanceDto;
import ru.erofitskiy.donstujavacourse.lesson2.model.Account;
import ru.erofitskiy.donstujavacourse.lesson2.service.AccountService;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

    @Autowired
    private AccountService service;

    @PostMapping()
    public Account create(@RequestBody CreateAccountDto dto) {
        return service.create(dto.userId());
    }

    @PatchMapping()
    public Double getBalanceById(@RequestBody GetBalanceDto dto) {
        return 0.0d;
    }

}
