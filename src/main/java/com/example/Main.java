package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.AppConfig;
import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

public class Main {
    public static void main(String[] args) {
        try {
            ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

            Employee employee = new Employee(1, "Mustafa", 5000);
            Employee employee2 = new Employee(2, "MIPS", 15000);
            Employee employee3 = new Employee(3, "MOAATROX", 25000);
            Employee employee4 = new Employee(4, "PUBG", 35000);

            EmployeeRepository repository = context.getBean("inMemoryRepository", EmployeeRepository.class);
            repository.saveEmployee(employee);
            repository.saveEmployee(employee2);
            repository.saveEmployee(employee3);
            repository.saveEmployee(employee4);
            repository.saveEmployee(employee4);
            System.out.println("=====================================");
            for (Employee emp : repository.findAllEmployees()) {
                System.out.println(emp.toString());
            }
            System.out.println("======================================");
            repository.riseSalary(1, 40);
            repository.riseSalary(1, 35);
            for (Employee emp : repository.findAllEmployees()) {
                System.out.println(emp.toString());
            }

            System.out.println("======================================");

            repository.updateEmployee(1, new Employee(1, "Mustafa ElGen", employee.getSalary()));
            for (Employee emp : repository.findAllEmployees()) {
                System.out.println(emp.toString());
            }
            System.out.println("=====================================");
            repository.findEmployeeById(99);
        } catch (Exception exception) {
            // exception.printStackTrace();
            System.out.println(exception.getMessage());
        }

    }
}