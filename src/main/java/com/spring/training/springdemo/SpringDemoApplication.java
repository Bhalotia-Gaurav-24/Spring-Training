package com.spring.training.springdemo;

import com.spring.training.springdemo.dao.CustomerDAO;
import com.spring.training.springdemo.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);

    }

}
