package com.employeeApp.Service;

import java.util.List;

import com.employeeApp.payload.EmployeeDto;



public interface EmployeeService 
{
	public EmployeeDto addEmployeeDetails(EmployeeDto employeeDto,int departmentId,int projectId);
	
	public List<EmployeeDto> getallEmployees();
	
	public EmployeeDto getEmployeeById(int employeeId);
	
	
	public EmployeeDto updateEmployeeById(EmployeeDto employeeDto, int employeeId);

	public void deleteEmployeeById(int employeeId);
	
	public List<EmployeeDto> getAllEmployeeByDept(int departmentId);


}
