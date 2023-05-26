package com.example.demo.model.employee;

public class Employee {
    private final String name = "Peter";
    private final String secondName = "Alex";
    private final String sureName = "Black";
    private String position;
    private String email;
    private String phoneNumber;
    private String salary;

    public Employee() {
    }

    public Employee(String position, String email, String phoneNumber, String salary) {
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public Employee(String email, String phoneNumber, String salary) {
        this.position = "Accountant";
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSureName() {
        return sureName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", sureName='" + sureName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
