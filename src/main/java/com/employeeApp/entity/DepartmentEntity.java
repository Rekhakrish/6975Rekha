package com.employeeApp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Builder
@Table(name="Department")
public class DepartmentEntity 
{   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int departmentId;
	
	@Column(nullable = false)
	@NotEmpty(message="department name cannot be empty")
	@Size(min=5,max=20)
	private String departmentName;
	
    @ManyToOne
    private AdminEntity admin;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<EmployeeDetailEntity> employee=new ArrayList<>();

	@OneToMany(cascade=CascadeType.ALL)
	private List<ProjectEntity> project=new ArrayList<>();
	
//    @ManyToOne
//    private AdminEntity admin;
}
