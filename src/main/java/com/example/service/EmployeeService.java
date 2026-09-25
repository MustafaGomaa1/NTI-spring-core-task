package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee findEmployee(int id) {
        return employeeRepository.findEmployeeById(id);
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.findAllEmployees();
    }

    public void updateEmployee(int id, Employee employee) {
        employeeRepository.updateEmployee(id, employee);
    }

    public void deleteEmployee(int id) {
        employeeRepository.deleteEmployee(id);
    }

    public void riseSalary(int employeeId, int percentage) {
        employeeRepository.riseSalary(employeeId, percentage);
    }
}
