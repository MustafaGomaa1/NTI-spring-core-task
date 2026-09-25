package com.example.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.notify.Notify;
import com.example.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    @Autowired
    @Qualifier("emailNotify")
    private final Notify notify;

    public void addedEmployee(Employee employee) {
        notify.addedEmployee(LocalDateTime.now().toString(), employee);
        employeeRepository.saveEmployee(employee);
    }

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

        notify.riseEmployeeSalary(LocalDateTime.now().toString(), findEmployee(employeeId));
        employeeRepository.riseSalary(employeeId, percentage);
    }
}
