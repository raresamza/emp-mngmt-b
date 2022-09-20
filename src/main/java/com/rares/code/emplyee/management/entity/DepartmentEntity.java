package com.rares.code.emplyee.management.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "departments")
public class DepartmentEntity {

    @Column(name = "dept_id")
    @Id
    @SequenceGenerator(
            name = "dept_sequence",
            sequenceName = "dept_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "dept_sequence")
    private Long id;
    private String deptName;
    private String deptCode;

//    @OneToMany(
//            cascade = CascadeType.ALL,
//            fetch = FetchType.LAZY
//    )
//    @JoinColumn(
//            name = "dept_id",
//            referencedColumnName = "dept_id")
    @OneToMany (
            mappedBy = "departmentEntity",
            fetch = FetchType.LAZY)
    private List<EmployeeEntity> employeeEntityList = new ArrayList<>();;
}
