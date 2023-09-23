package ru.erofitskiy.donstujavacourse.lesson2.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.erofitskiy.donstujavacourse.lesson2.dto.GetBalanceDto;
import ru.erofitskiy.donstujavacourse.lesson2.model.Account;
import ru.erofitskiy.donstujavacourse.lesson2.service.AccountService;
import ru.erofitskiy.donstujavacourse.lesson2.service.impl.AccountServiceImpl;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

    private final AccountService service = new AccountServiceImpl();

    @PostMapping()
    public Account create(String userId) {
        return service.create(userId);
    }

    @PostMapping()
    public Double getBalanceById(@RequestBody GetBalanceDto dto) {
        return 0.0d;
    }


}
