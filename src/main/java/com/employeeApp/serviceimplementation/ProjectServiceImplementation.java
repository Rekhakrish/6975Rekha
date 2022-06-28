 package com.employeeApp.serviceimplementation;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeApp.Service.ProjectService;
import com.employeeApp.entity.DepartmentEntity;
import com.employeeApp.entity.EmployeeDetailEntity;
import com.employeeApp.entity.ProjectEntity;
import com.employeeApp.exception.ResourceNotFoundException2;
import com.employeeApp.payload.DepartmentDto;
import com.employeeApp.payload.EmployeeDto;
import com.employeeApp.payload.ProjectDto;
import com.employeeApp.repository.DepartmentRepository;
import com.employeeApp.repository.EmployeeRepository;
import com.employeeApp.repository.ProjectRepository;

@Service
public class ProjectServiceImplementation implements ProjectService
{
	@Autowired
	ProjectRepository projectRepository;
	
	@Autowired
	ModelMapper modelmapper;
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public ProjectDto createproject(ProjectDto projectDto, int departmentId)
	{
		DepartmentEntity departmentEntity = this.departmentRepository.findById(departmentId)
				.orElseThrow(() -> new ResourceNotFoundException2("Department", "DepartmentId", departmentId));
        projectDto.setDepartment(this.modelmapper.map(departmentEntity, DepartmentDto.class));
        List<EmployeeDetailEntity> employeeEntityList=this.employeeRepository.findAll();
        List<EmployeeDto> employeeDtoList=employeeEntityList.stream().map(employee->this.modelmapper.map(employeeEntityList,EmployeeDto.class))
        		.collect(Collectors.toList());
        projectDto.setEmployee(employeeDtoList);
        ProjectEntity savedProject=this.projectRepository.save(this.ProjectDtoToProjectEntity(projectDto));
        		return this.ProjectEntityToProjectDto(savedProject);
	}

	@Override
	public List<ProjectDto> getallProjects() {
		List<ProjectEntity> projectdetails=this.projectRepository.findAll();

		List<ProjectDto> projectdetailsDto=projectdetails.stream().map(project->this.ProjectEntityToProjectDto(project)).collect(Collectors.toList());
        return projectdetailsDto;	
}

	@Override
	public ProjectDto getProjectById(int projectId) {
		ProjectEntity projectdetail = this.projectRepository.findById(projectId)
				.orElseThrow(() -> new ResourceNotFoundException2("Project", "ProjectId", projectId));

		return this.ProjectEntityToProjectDto(projectdetail);
	}

	@Override
	public ProjectDto updateProjectById(ProjectDto projectDto, int projectId) 
	{
		ProjectEntity projectdetail = this.projectRepository.findById(projectId)
				.orElseThrow(() -> new ResourceNotFoundException2("Project", "ProjectId", projectId));
		//projectdetail.setProjectId(projectDto);
//		projectdetail.setProjectTitle(projectDto.getProjectTitle());
//		projectdetail.setProjectLeadName(projectDto.getProjectLeadName());
//		projectdetail.setTeamSize(projectDto.getTeamSize());

		
		ProjectEntity updatedProject=this.projectRepository.save(this.ProjectDtoToProjectEntity(projectDto));
        return this.ProjectEntityToProjectDto(updatedProject);
		
		
}

	@Override
	public void deleteProjectById(int projectId)
	{
		ProjectEntity projectdetail = this.projectRepository.findById(projectId)
				.orElseThrow(() -> new ResourceNotFoundException2("Project", "ProjectId", projectId));
		this.projectRepository.delete(projectdetail);
	
		
	}
	public ProjectEntity ProjectDtoToProjectEntity(ProjectDto projectDto)
	{
		
		return this.modelmapper.map(projectDto, ProjectEntity.class);

	}

	public ProjectDto ProjectEntityToProjectDto(ProjectEntity projectEntity) 
	{
		
		return this.modelmapper.map(projectEntity, ProjectDto.class);
	}
	
	@Override
	public List<ProjectDto> getAllProjectByDept(int departmentId)
	{
		DepartmentEntity departmentEntity = this.departmentRepository.findById(departmentId)
				.orElseThrow(() -> new ResourceNotFoundException2("Department", "DepartmentId", departmentId));
        List<ProjectEntity> projectEntity=this.projectRepository.findByDepartment(departmentId);
        List<ProjectDto> projectDto=projectEntity.stream().map(project->this.ProjectEntityToProjectDto(project)).collect(Collectors.toList());
        return projectDto;
	}

	

}
