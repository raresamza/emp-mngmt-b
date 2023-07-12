package com.rares.code.emplyee.management.entity;


import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "departments")

public class DepartmentEntity {

    @Column(name = "dept_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
            cascade = CascadeType.ALL)
    private List<EmployeeEntity> employeeEntityList = new ArrayList<>();
}
