package com.employeeApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeeApp.entity.DepartmentEntity;
import com.employeeApp.entity.EmployeeDetailEntity;


public interface EmployeeRepository extends JpaRepository<EmployeeDetailEntity, Integer>
{
   List<EmployeeDetailEntity> findByDepartment(int departmentId);
}
