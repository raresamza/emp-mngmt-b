package com.rares.code.emplyee.management.controller;


import com.rares.code.emplyee.management.model.Employee;
import com.rares.code.emplyee.management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/v1/")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employees")
    public Employee createEntity(@RequestBody Employee employee) {
        return employeeService.createEntity(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteEmployee (@PathVariable("id") Long id) {
        boolean deleted=false;
        deleted = employeeService.deleteEmployee(id);
        Map<String,Boolean> response=new HashMap<>();
        response.put("deleted",deleted);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) {
        Employee employee=null;
        employee=employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {
        employee=employeeService.updateEmployee(id,employee);
        return ResponseEntity.ok(employee);
    }
}
