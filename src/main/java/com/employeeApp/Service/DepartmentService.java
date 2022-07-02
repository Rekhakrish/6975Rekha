package com.employeeapp.Service;

import java.util.List;

import com.employeeapp.payload.DepartmentDto;

public interface DepartmentService
{
	public DepartmentDto createEmployeeDepartment(DepartmentDto department, int adminId);

	public List<DepartmentDto> getallDepartments();

	public DepartmentDto getDepartmentById(int departmentId);

	public DepartmentDto updateDepartmentById(DepartmentDto departmentDto, int departmentId);

	public void deleteDepartmentById(int departmentId);

	public List<DepartmentDto> getAllDepartmentByAdmin(int adminId);

}
