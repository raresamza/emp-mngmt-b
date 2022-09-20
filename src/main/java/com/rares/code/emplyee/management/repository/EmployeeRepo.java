package com.rares.code.emplyee.management.repository;

import com.rares.code.emplyee.management.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Long> {

}
