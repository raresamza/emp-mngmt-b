package com.rares.code.emplyee.management.service;


import com.rares.code.emplyee.management.entity.DepartmentEntity;
import com.rares.code.emplyee.management.entity.EmployeeEntity;
import com.rares.code.emplyee.management.model.Department;
import com.rares.code.emplyee.management.model.Employee;
import com.rares.code.emplyee.management.repository.DepartmentRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    private final DepartmentRepo departmentRepo;

    public DepartmentServiceImpl(DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    @Override
    public Department createEntity(Department department) {
        DepartmentEntity departmentEntity = new DepartmentEntity();
        BeanUtils.copyProperties(department,departmentEntity);
        departmentRepo.save(departmentEntity);
        return department;
    }
}
