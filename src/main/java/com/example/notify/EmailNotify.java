package com.example.notify;

import org.springframework.stereotype.Component;

import com.example.model.Employee;

@Component
public class EmailNotify implements Notify {

    @Override
    public void addedEmployee(String message, Employee employee) {
        System.out.println(
                "{EMAIL} :" + message + " .\nTo ========> { " + employee.getName() + " }"
                        + "\nUser Added <==============>");
    }

    @Override
    public void riseEmployeeSalary(String message, Employee employee) {
        System.out.println(
                "{EMAIl} :" + message + " .\nTo ========> { " + employee.getName() + " }"
                        + "\nSalary  Raised <==============>");
    }

}
