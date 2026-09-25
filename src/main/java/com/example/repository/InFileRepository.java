package com.example.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.model.Employee;

@Component
public class InFileRepository implements EmployeeRepository {

    @Override
    public Employee findEmployeeById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findEmployeeById'");
    }

    @Override
    public List<Employee> findAllEmployees() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllEmployees'");
    }

    @Override
    public void saveEmployee(Employee employee) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveEmployee'");
    }

    @Override
    public void deleteEmployee(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteEmployee'");
    }

    @Override
    public void updateEmployee(int id, Employee employee) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateEmployee'");
    }

    @Override
    public void riseSalary(int id, int percentage) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'riseSalary'");
    }

}
