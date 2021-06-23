package com.spring.training.springdemo.model;

import com.spring.training.springdemo.dao.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class MyCommandLineRunner implements CommandLineRunner {


    @Autowired
    CustomerDAO customerDAO;

    /**
     * This function will execute once and for all -
     * This is the last thing that executes after the container is instantiated
     * (The spring application has successfully started)
     *
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {


        customerDAO
                .getCustomers()
                .forEach(System.out::println);

        System.out.println("This is the last thing that executes after the container is instantiated (The spring application has successfully started)");

    }
}


