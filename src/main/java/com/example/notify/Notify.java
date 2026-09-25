package com.example.notify;

import com.example.model.Employee;

public interface Notify {

    void addedEmployee(String message, Employee employee);

    void riseEmployeeSalary(String message, Employee employee);
}
