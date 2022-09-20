package com.rares.code.emplyee.management.repository;

import com.rares.code.emplyee.management.entity.DepartmentEntity;
import com.rares.code.emplyee.management.entity.EmployeeEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeRepoTest {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Test
    public void saveEmpWithDept() {

        DepartmentEntity department = DepartmentEntity.builder()
                .deptCode("it=06")
                .deptName("it")
                .build();
        DepartmentEntity department1 = DepartmentEntity.builder()
                .deptCode("EEE-007")
                .deptName("EEE")
                .build();
        DepartmentEntity department2 = DepartmentEntity.builder()
                .deptCode("EEE-0078")
                .deptName("EEE")
                .build();


//        EmployeeEntity entity3= EmployeeEntity.builder()
//                .firstName("manos")
//                .lastName("hermanos")
//                .email("manoshermanos@gmail.com")
//                .departmentEntity(department)
//                .build();
        EmployeeEntity entity1= EmployeeEntity.builder()
                .firstName("Mita")
                .lastName("mihai")
                .email("mita@gmail.com")
                .departmentEntity(department)
                .build();
        EmployeeEntity entity2= EmployeeEntity.builder()
                .firstName("Mita")
                .lastName("mihai")
                .email("mita@gmail.com")
                .departmentEntity(department1)
                .build();
        EmployeeEntity entity3= EmployeeEntity.builder()
                .firstName("manos")
                .lastName("hermanos")
                .email("manoshermanos@gmail.com")
                .departmentEntity(department1)
                .build();

        System.out.println(entity1);
        System.out.println(entity2);
        System.out.println(entity3);
        employeeRepo.save(entity3);
        employeeRepo.save(entity1);
//        employeeRepo.save(entity3);
        employeeRepo.save(entity2);

    }
}