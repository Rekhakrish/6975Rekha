package com.employeeApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeApp.Service.ProjectService;
import com.employeeApp.exception.ApiResponse1;
import com.employeeApp.payload.ProjectDto;

@RestController
@RequestMapping("/api")
public class ProjectController 
{
	@Autowired
	ProjectService projectService;
	
	//To create a project by departmentId
	@PostMapping("/department/{departmentId}/project")
	public ResponseEntity<ProjectDto> createproject( @PathVariable int departmentId,@RequestBody ProjectDto project)
	{
		
		ProjectDto createproject=this.projectService.createproject(project, departmentId);
		return new ResponseEntity<ProjectDto>(createproject,HttpStatus.CREATED);
	}
	
	//To fetch all projects
	@GetMapping("/projects")
	public ResponseEntity<List<ProjectDto>> getAllProjects()
	{
		List<ProjectDto> allprojects=this.projectService.getallProjects();
		
		return new ResponseEntity<List<ProjectDto>>(allprojects,HttpStatus.OK);
		
	}	
	
	
	//To fetch a project by id
	@GetMapping("/project/{projectId}")
	public ResponseEntity<ProjectDto> getProjectById(@PathVariable int projectId)
	{
		ProjectDto getProject=this.projectService.getProjectById(projectId);
		return new ResponseEntity<ProjectDto>(getProject,HttpStatus.OK);
	}

	
	//To update a project by id
	@PutMapping("/project/{projectId}")
	public ResponseEntity<ProjectDto> updateProjectById(@RequestBody ProjectDto project,@PathVariable int projectId)
	{
		ProjectDto updateproject=this.projectService.updateProjectById(project, projectId);
		return new ResponseEntity<ProjectDto>(updateproject,HttpStatus.OK);
	}
	
	
	//To delete a project by id
	@DeleteMapping("/project/{projectId}")
	public ResponseEntity<ApiResponse1> deleteProjectById(@PathVariable int projectId)
	{
		ApiResponse1 deleteproject=new ApiResponse1("Employee details was deleted successfully",true);
		return new ResponseEntity<ApiResponse1>(deleteproject,HttpStatus.OK);
	}
}
