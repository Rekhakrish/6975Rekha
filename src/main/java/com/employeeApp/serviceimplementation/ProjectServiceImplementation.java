 package com.employeeapp.serviceimplementation;

	import java.util.List;
	import java.util.stream.Collectors;

	import org.modelmapper.ModelMapper;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.employeeapp.Service.ProjectService;
	import com.employeeapp.entity.DepartmentEntity;
	import com.employeeapp.entity.ProjectEntity;
	import com.employeeapp.exception.ResourceNotFoundException2;
	import com.employeeapp.payload.DepartmentDto;
	import com.employeeapp.payload.ProjectDto;
	import com.employeeapp.repository.DepartmentRepository;
	import com.employeeapp.repository.EmployeeRepository;
	import com.employeeapp.repository.ProjectRepository;

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

			ProjectEntity savedProject = this.projectRepository.save(this.ProjectDtoToProjectEntity(projectDto));

			return this.ProjectEntityToProjectDto(savedProject);
		}

		@Override
		public List<ProjectDto> getallProjects() 
		{
			List<ProjectDto> getAllProjects = this.projectRepository.findAll().stream()
					.map(project -> this.ProjectEntityToProjectDto(project)).collect(Collectors.toList());
			return getAllProjects;
		}

		@Override
		public ProjectDto getProjectById(int projectId) 
		{
			ProjectEntity projectdetail = this.projectRepository.findById(projectId)
					.orElseThrow(() -> new ResourceNotFoundException2("Project", "ProjectId", projectId));

			return this.ProjectEntityToProjectDto(projectdetail);
		}

		@Override
		public ProjectDto updateProjectById(ProjectDto projectDto, int projectId) 
		{
			ProjectEntity projectdetail = this.projectRepository.findById(projectId)
					.orElseThrow(() -> new ResourceNotFoundException2("Project", "ProjectId", projectId));

			ProjectEntity updatedProject = this.projectRepository.save(this.ProjectDtoToProjectEntity(projectDto));
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
			
			List<ProjectEntity> projectEntity = this.projectRepository.findByDepartment(departmentEntity);
			List<ProjectDto> projectDto = projectEntity.stream().map(project -> this.ProjectEntityToProjectDto(project))
					.collect(Collectors.toList());
			return projectDto;
		}

	}
