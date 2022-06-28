package com.employeeApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.employeeApp.payload.DepartmentDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="EmployeeDetails")
public class EmployeeDetailEntity 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int employeeId;
    
	@Column(nullable=false)
	private String employeeFirstName;
	
	@Column(nullable=false)
	private String employeeLastName;
	
	@Column(nullable=false)
	private String employeeAddress;
	
	@Column(nullable=false)
	private String employeeEmail;
	
	@Column(nullable=false)
	private String employeeMobileNumber;
	
	@Column(nullable=false)
	private String employeeBloodGroup;
	
	@Column(nullable=false)
	private String employeeDesignation;
	
	@Column(nullable=false)
	private String employeeSalary;
	
	@ManyToOne
	 private DepartmentEntity department;
	
	@ManyToOne
	private ProjectEntity project;

}
