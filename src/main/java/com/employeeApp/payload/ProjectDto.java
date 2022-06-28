package com.employeeApp.payload;

import java.util.List;

public class ProjectDto 
{
    private int projectId;
	
	private String projectTitle;
	
	private String projectLeadName;
	
//    private int TeamSize;
    
    private EmployeeDto employee;
	
    private DepartmentDto department;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public String getProjectLeadName() {
		return projectLeadName;
	}

	public void setProjectLeadName(String projectLeadName) {
		this.projectLeadName = projectLeadName;
	}


	public EmployeeDto getEmployee() {
		return employee;
	}

	public void setEmployee(List<EmployeeDto> employeeDtoList)  {
		this.employee = employee;
	}

	public DepartmentDto getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}


	
}
