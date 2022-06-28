package com.employeeApp.controller;

import javax.validation.Valid;

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
import java.util.*;
import com.employeeApp.Service.EmployeeService;
import com.employeeApp.exception.ApiResponse1;
import com.employeeApp.payload.DepartmentDto;
import com.employeeApp.payload.EmployeeDto;



@RestController
@RequestMapping("/api")
public class EmployeeController 
{
	@Autowired
	EmployeeService employeeService;

	
	//To create an employee by deptId and projectId
	@PostMapping("/department/{departmentId}/project/{projectId}/employeeDetails")
	public ResponseEntity<EmployeeDto> addEmployeeDetails(@Valid @PathVariable int departmentId,@RequestBody EmployeeDto employee,@PathVariable int projectId)
	{
		
		EmployeeDto addEmployeeDetails=this.employeeService.addEmployeeDetails(employee, departmentId,projectId);
		return new ResponseEntity<EmployeeDto>(addEmployeeDetails,HttpStatus.CREATED);
	}
	
	
	//To fetch all the employees
	@GetMapping("/employeeDetails")
	public ResponseEntity<List<EmployeeDto>> getAllEmployees()
	{
		List<EmployeeDto> allEmployees=this.employeeService.getallEmployees();
		
		return new ResponseEntity<List<EmployeeDto>>(allEmployees,HttpStatus.OK);
		
	}	
	
	
	//To fetch an employee by id
	@GetMapping("/employeeDetails/{employeeId}")
	public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable int employeeId)
	{
		EmployeeDto getEmployee=this.employeeService.getEmployeeById(employeeId);
		return new ResponseEntity<EmployeeDto>(getEmployee,HttpStatus.OK);
	}

	
	//To update employee by id
	@PutMapping("/employeeDetails/{employeeId}")
	public ResponseEntity<EmployeeDto> updateEmployeeDetails(@RequestBody EmployeeDto employee,@PathVariable int employeeId)
	{
		EmployeeDto updateEmployeeDetail=this.employeeService.updateEmployeeById(employee, employeeId);
		return new ResponseEntity<EmployeeDto>(updateEmployeeDetail,HttpStatus.OK);
	}
	
	
	//To delete employee by id
	@DeleteMapping("/employeeDetails/{employeeId}")
	public ResponseEntity<ApiResponse1> deleteEmployeeDetails(@PathVariable int employeeId)
	{
		ApiResponse1 deleteEmployeeDetails=new ApiResponse1("Employee details was deleted successfully",true);
		return new ResponseEntity<ApiResponse1>(deleteEmployeeDetails,HttpStatus.OK);
	}
	
	
	
}
