package com.rares.code.emplyee.management.model;


import com.rares.code.emplyee.management.entity.EmployeeEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private Long id;
    private String deptName;
    private String deptCode;
    private List<EmployeeEntity> employeeEntityList;
}
