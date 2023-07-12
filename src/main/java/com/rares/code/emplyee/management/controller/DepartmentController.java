package com.rares.code.emplyee.management.controller;


import com.rares.code.emplyee.management.model.Department;
import com.rares.code.emplyee.management.model.Employee;
import com.rares.code.emplyee.management.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/v1/")
public class DepartmentController {


    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/departments")
    public Department createEntity(@RequestBody Department department) {
        return departmentService.createEntity(department);
    }


    @PostMapping("/departments/{id}")
    public Department addEmpForDept(@RequestBody Department department, @PathVariable("id") Long id) {
        return departmentService.createEntity(department);
    }
}
