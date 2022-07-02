package com.employeeapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.employeeapp.entity.AdminEntity;
import com.employeeapp.entity.DepartmentEntity;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Integer> 
{
	List<DepartmentEntity> findByAdmin(AdminEntity admin);

}
