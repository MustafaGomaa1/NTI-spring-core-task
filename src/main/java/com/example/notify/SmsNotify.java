package com.example.notify;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.model.Employee;

@Component
@Primary
public class SmsNotify implements Notify {

    @Override
    public void addedEmployee(String message, Employee employee) {
        System.out.println(
                "{SMS} :" + message + " .\nTo ========> { " + employee.getName() + " }" + "\nUser Added==============");
    }

    @Override
    public void riseEmployeeSalary(String message, Employee employee) {
        System.out.println(
                "{SMS} :" + message + " .\nTo ========> { " + employee.getName() + " }" + "\nSalary Raise.=====");
    }

}
