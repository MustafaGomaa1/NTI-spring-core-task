package com.example.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.exceptions.EmployeeException;
import com.example.model.Employee;

@Component
@Primary
public class InMemoryRepository implements EmployeeRepository {
    private List<Employee> employees;

    public InMemoryRepository() {
        System.out.println("========= In Memory Employee Repository ===============");
        employees = new ArrayList<>();
    }

    @Override
    public Employee findEmployeeById(int id) {
        if (employees.size() == 0) {
            return null;
        }
        return employees.stream().filter(e -> e.getId() == id).findFirst()
                .orElseThrow(() -> new EmployeeException("Employee Id not Found"));
    }

    @Override
    public List<Employee> findAllEmployees() {
        return Collections.unmodifiableList(employees);
    }

    @Override
    public void saveEmployee(Employee employee) {
        if (employee.getName() != null && employee.getSalary() > 0)
            employees.add(employee);
        else
            throw new EmployeeException("Custom Employee Exception ");
    }

    @Override
    public void deleteEmployee(int id) {
        employees.remove(findEmployeeById(id));
        System.out.println("Employee Deleted");
    }

    @Override
    public void updateEmployee(int id, Employee employee) {
        Employee employee1 = findEmployeeById(id);
        employee1.setName(employee.getName());
        employee1.setSalary(employee.getSalary());
    }

    @Override
    public void riseSalary(int id, int percentage) {
        int max = 40;
        if (percentage > max) {
            System.out.println("Can't Increase this much");
        } else {
            Employee employee = findEmployeeById(id);
            double salary = employee.getSalary();
            salary = salary + (salary * 100 / percentage);
            employee.setSalary(salary);
        }
    }

}
