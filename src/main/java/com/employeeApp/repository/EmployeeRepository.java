package com.employeeapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.employeeapp.entity.DepartmentEntity;
import com.employeeapp.entity.EmployeeEntity;
import com.employeeapp.entity.ProjectEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>
{
	List<EmployeeEntity> findByDepartment(DepartmentEntity department);

	List<EmployeeEntity> findByProject(ProjectEntity project);

	Optional<EmployeeEntity> findByEmployeeEmail(String employeeEmail);
}
