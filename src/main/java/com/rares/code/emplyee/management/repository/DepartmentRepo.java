package com.rares.code.emplyee.management.repository;


import com.rares.code.emplyee.management.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<DepartmentEntity,Long> {


}
