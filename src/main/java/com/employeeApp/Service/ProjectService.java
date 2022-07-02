package com.employeeapp.Service;

import java.util.List;

import com.employeeapp.payload.ProjectDto;

public interface ProjectService 
{
	public ProjectDto createproject(ProjectDto projectDto, int departmentId);

	public List<ProjectDto> getallProjects();

	public ProjectDto getProjectById(int projectId);

	public ProjectDto updateProjectById(ProjectDto projectDto, int projectId);

	public void deleteProjectById(int projectId);

	public List<ProjectDto> getAllProjectByDept(int departmentId);

}
