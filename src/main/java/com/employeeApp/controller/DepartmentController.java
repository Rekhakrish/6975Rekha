package com.employeeApp.controller;

import java.util.List;

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


import com.employeeApp.Service.DepartmentService;
import com.employeeApp.exception.ApiResponse1;
import com.employeeApp.payload.DepartmentDto;

@RestController
@RequestMapping("/api")

public class DepartmentController 
{
	@Autowired
	private DepartmentService departmentService;
	
	
	//To create a department by admin Id
	@PostMapping("/Department/{adminId}")
	public ResponseEntity<DepartmentDto> createDepartment(@Valid @RequestBody DepartmentDto department,@PathVariable int adminId)
	{
		DepartmentDto createdDepartment=this.departmentService.createEmployeeDepartment(department,adminId);
		
		return new ResponseEntity<DepartmentDto>(createdDepartment,HttpStatus.CREATED);
		
	}
	
	//To fetch all departments
	@GetMapping("/Department/")
	public ResponseEntity<List<DepartmentDto>> getAllDepartments()
	{
		List<DepartmentDto> allDepartments=this.departmentService.getallDepartments();
		
		return new ResponseEntity<List<DepartmentDto>>(allDepartments,HttpStatus.OK);
		
	}
	
	//To fetch a department by deptId
	@GetMapping("/Department/{departmentId}")
	public ResponseEntity<DepartmentDto> getDepartmentbyId(@PathVariable int departmentId)
	{
		DepartmentDto departmentDto =this.departmentService.getDepartmentById(departmentId);
		return new ResponseEntity<DepartmentDto>(departmentDto,HttpStatus.OK);
	}
	
	
	//To update department by deptId
	@PutMapping("/Department/{departmentId}")
	public ResponseEntity<DepartmentDto> updateDepartmentbyId(@RequestBody DepartmentDto department,@PathVariable int departmentId)
	{
		DepartmentDto departmentDto=this.departmentService.updateDepartmentById(department,departmentId);
		
		return new ResponseEntity<DepartmentDto>(departmentDto,HttpStatus.OK);
		
	}
	
	//To delete department by deptId
	@DeleteMapping("/Department/{departmentId}")
	public ResponseEntity<ApiResponse1> deleteDepartmentbyId(@PathVariable int departmentId)
	{
		this.departmentService.deleteDepartmentById(departmentId);
		ApiResponse1 apiResponse1=new ApiResponse1("DepartmentId is deleted successfully", true);
		
		return new ResponseEntity<ApiResponse1>(HttpStatus.OK);
		
	}
	
	
	//To fetch all department by adminId
	@GetMapping("department/{adminId}")
	
	public ResponseEntity<List<DepartmentDto>> getAlldepartmentByAdmin(@PathVariable int adminId) 
	{
		List<DepartmentDto> departmentList = this.departmentService.getAllDepartmentByAdmin(adminId);
		return new ResponseEntity<List<DepartmentDto>>(departmentList, HttpStatus.OK);
	}



}
