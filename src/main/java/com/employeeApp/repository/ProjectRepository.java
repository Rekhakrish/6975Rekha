package com.employeeApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeeApp.entity.ProjectEntity;
import com.employeeApp.serviceimplementation.ProjectServiceImplementation;



public interface ProjectRepository extends JpaRepository<ProjectEntity, Integer>
{
	List<ProjectEntity> findByDepartment(int departmentId);

	
}
