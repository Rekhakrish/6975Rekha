package com.employeeApp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
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
@Table(name="Admin")
public class AdminEntity 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int adminId;
	
	@Column(nullable=false)
	@NotEmpty(message="adminname cannot be empty")
	
	private String adminName;
	
	@Column(nullable=false)
    @NotEmpty(message="Invalid Email Id")
	@Email
	@Pattern(message="Invalid Id",regexp="^,+$")
	private String adminEmail;
	
	@Column(nullable=false)
	@Size(min=6,max=18,message="password should")
	@Pattern(message="your password must match with the specification"
				+ "[0-9],[a-z],[A-Z],[@#$%^&+=],", regexp = "^(?=.*[0-9])"
	            + "(?=.*[a-z])(?=.*[A-Z])"
	            + "(?=.*[@#$%^&+=])"
	            + "(?=\\S+$).{8,20}$")

	private String password;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<DepartmentEntity> department=new ArrayList<DepartmentEntity>();

}
