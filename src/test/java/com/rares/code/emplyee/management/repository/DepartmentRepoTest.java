package com.rares.code.emplyee.management.repository;

import com.rares.code.emplyee.management.entity.DepartmentEntity;
import com.rares.code.emplyee.management.entity.EmployeeEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class DepartmentRepoTest {





    @Autowired
    private DepartmentRepo departmentRepo;


//    @Test
//    public void saveDept() {
//
//
//
//        EmployeeEntity entity1 =  EmployeeEntity.builder()
//                .firstName("raress")
//                .lastName("amza")
//                .email("raresamza@gmail.com")
//                .build();
//        EmployeeEntity entity2 =  EmployeeEntity.builder()
//                .firstName("manos")
//                .lastName("hermanos")
//                .email("manoshermanos@gmail.com")
//                .build();
//
//        DepartmentEntity departmentEntity = DepartmentEntity.builder()
//                .deptName("IT")
//                .deptCode("IT-06")
//                .employeeEntityList(List.of(entity1,entity2))
//                .build();
//
//        departmentRepo.save(departmentEntity);
//    }

}