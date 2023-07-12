package com.rares.code.emplyee.management.service;

import com.rares.code.emplyee.management.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee createEntity(Employee employee);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long id);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);


    Integer getEmployeeWorkedHours(Long id);

    Employee updateEmployeeWorkedHours(Long id, Employee employee, Integer hours);
}
