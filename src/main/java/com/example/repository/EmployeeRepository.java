package com.example.repository;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeRepository {

    Employee findEmployeeById(int id);

    List<Employee> findAllEmployees();

    void saveEmployee(Employee employee);

    void deleteEmployee(int id);

    void updateEmployee(int id, Employee employee);

    void riseSalary(int id, int percentage);
}
