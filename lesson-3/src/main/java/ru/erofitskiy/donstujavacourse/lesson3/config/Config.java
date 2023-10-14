package ru.erofitskiy.donstujavacourse.lesson2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.erofitskiy.donstujavacourse.lesson2.dao.UserDao;
import ru.erofitskiy.donstujavacourse.lesson2.dao.impl.UserDaoImpl;

@Configuration
@ComponentScan(basePackages = "ru.erofitskiy.donstujavacourse.lesson2")
public class Config {

    @Bean
    public UserDao userDao() {
        return new UserDaoImpl();
    }

}
