package com.rares.code.emplyee.management.service;

import com.rares.code.emplyee.management.entity.EmployeeEntity;
import com.rares.code.emplyee.management.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeService {

    Employee createEntity(Employee employee);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long id);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
