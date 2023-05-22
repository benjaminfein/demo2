package com.example.demo;

import com.example.demo.model.car.Car;
import com.example.demo.model.employee.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        Employee accountant = new Employee("accountant@mail.com", "+000000000000", "1000$");
        System.out.println(accountant.toString());
        Car.start();

        SpringApplication.run(Demo2Application.class, args);
    }

}
