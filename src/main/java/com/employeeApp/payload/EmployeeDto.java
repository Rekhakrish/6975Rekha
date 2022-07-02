package com.employeeapp.payload;

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

public class EmployeeDto 
{
	private int employeeId;

	private String employeeFirstName;

	private String employeeLastName;

	private String employeeAddress;

	private String employeeEmail;

	private String employeeMobileNumber;

	private String employeeBloodGroup;

	private String employeeDesignation;

	private String employeeSalary;

	private DepartmentDto department;

	private ProjectDto project;

}
