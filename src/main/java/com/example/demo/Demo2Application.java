package com.example.demo;

import com.example.demo.model.car.Car;
import com.example.demo.model.employee.Employee;
import com.example.demo.model.sameName.SameName;
import org.springframework.boot.SpringApplication;

public class Demo2Application {

    public static void main(String[] args) {
        Employee accountant = new Employee("accountant@mail.com", "+000000000000", "1,000$");
        Employee businessman = new Employee("Businessman", "businessman@mail.com",
                "+1111111111111", "10,000$");
        Employee employee = new Employee();
        employee.setPosition("Programmer");
        employee.setEmail("programmer@mail.com");
        employee.setPhoneNumber("+222222222222");
        employee.setSalary("5,000$");
        System.out.println(accountant);
        System.out.println(businessman);
        System.out.println(employee);
        Car.start();
        SameName sameName = new SameName();
        com.example.demo.model.secondSameName.SameName secondSameName = new com.example.demo.model.secondSameName.SameName();

        SpringApplication.run(Demo2Application.class, args);
    }

}
