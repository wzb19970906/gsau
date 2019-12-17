package com.itlaobing.main;

import com.itlaobing.model.Users;
import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@ComponentScan(basePackages = {"com.itlaobing.biz","com.itlaobing.controller"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
