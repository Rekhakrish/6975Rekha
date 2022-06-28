package com.employeeApp.payload;

import java.util.List;

import com.employeeApp.entity.AdminEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class DepartmentDto
{
	private int departmentId;
	
	private String departmentName;
	
	
    
	private List<EmployeeDto> employee;
	
	private List <ProjectDto> project;
	
	private AdminDto admin;

	

	
	
}
