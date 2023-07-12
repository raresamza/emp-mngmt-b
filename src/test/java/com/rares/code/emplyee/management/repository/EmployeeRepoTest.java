package com.rares.code.emplyee.management.repository;

import com.rares.code.emplyee.management.entity.DepartmentEntity;
import com.rares.code.emplyee.management.entity.EmployeeEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeRepoTest {

    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private DepartmentRepo departmentRepo;


    @Test
    public void saveEmpWithDept() {

        DepartmentEntity department = DepartmentEntity.builder()
                .deptCode("it=06")
                .deptName("it")
                .employeeEntityList(List.of())
                .build();

        EmployeeEntity entity1= EmployeeEntity.builder()
                .firstName("Mita")
                .lastName("mihai")
                .email("mita@gmail.com")
                .departmentEntity(department)
                .build();


        System.out.println(entity1);
        departmentRepo.save(department);

    }
}