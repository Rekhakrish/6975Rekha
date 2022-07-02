package com.employeeapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.employeeapp.entity.DepartmentEntity;
import com.employeeapp.entity.ProjectEntity;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Integer>
{
	List<ProjectEntity> findByDepartment(DepartmentEntity department);

	Optional<ProjectEntity> findByProjectTitle(String projectTitle);

}
