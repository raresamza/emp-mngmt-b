package com.rares.code.emplyee.management.service;


import com.rares.code.emplyee.management.entity.EmployeeEntity;
import com.rares.code.emplyee.management.model.Employee;
import com.rares.code.emplyee.management.repository.EmployeeRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public Employee createEntity(Employee employee) {
        ////employee vine din front end si o fol doar pt front end
        ////in backend salvezi doar entity

        //sau get data from db cu entity si la controller pasezi employee
        EmployeeEntity employeeEntity = new EmployeeEntity();
        BeanUtils.copyProperties(employee,employeeEntity);
        employeeRepo.save(employeeEntity);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<EmployeeEntity> employeeEntities= employeeRepo.findAll();
        List<Employee> employees= employeeEntities.stream().map(employeeEntity
                -> new Employee(employeeEntity.getId(),
                employeeEntity.getFirstName(),
                employeeEntity.getLastName(),
                employeeEntity.getEmail()))
                .toList();
        return employees;
    }

    @Override
    public boolean deleteEmployee(Long id) {
        EmployeeEntity employee=employeeRepo.findById(id).get();
        //hnadle exception with cusotm exception
        employeeRepo.delete(employee);
        return true;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        EmployeeEntity employeeEntity=employeeRepo.findById(id).get();
        Employee employee=new Employee();
        BeanUtils.copyProperties(employeeEntity,employee);
        return employee;

    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        EmployeeEntity employeeEntity=employeeRepo.findById(id).get();
        employeeEntity.setEmail(employee.getEmail());
        employeeEntity.setFirstName(employee.getFirstName());
        employeeEntity.setLastName(employee.getLastName());
        employeeRepo.save(employeeEntity);
        return employee;
    }
}
