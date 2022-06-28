package com.employeeApp.serviceimplementation;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeApp.Service.EmployeeService;
import com.employeeApp.entity.DepartmentEntity;
import com.employeeApp.entity.EmployeeDetailEntity;
import com.employeeApp.entity.ProjectEntity;
import com.employeeApp.exception.ResourceNotFoundException2;
import com.employeeApp.payload.DepartmentDto;
import com.employeeApp.payload.EmployeeDto;
import com.employeeApp.payload.ProjectDto;
import com.employeeApp.repository.DepartmentRepository;
import com.employeeApp.repository.EmployeeRepository;
import com.employeeApp.repository.ProjectRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService
{
    @Autowired
    EmployeeRepository employeeRepository;
    
    @Autowired
    DepartmentRepository departmentRepository;
    
    @Autowired
    ModelMapper modelMapper;
    
    @Autowired
    ProjectRepository projectRepository;
    
	@Override
	public EmployeeDto addEmployeeDetails(EmployeeDto employeeDto,int departmentId,int projectId) 
	{
		DepartmentEntity departmentEntity = this.departmentRepository.findById(departmentId)
				.orElseThrow(() -> new ResourceNotFoundException2("Department", "DepartmentId", departmentId));
		ProjectEntity projectEntity=this.projectRepository.findById(projectId).orElseThrow(()->new ResourceNotFoundException2("Project","ProjectId",projectId));
	    employeeDto.setDepartment(this.modelMapper.map(departmentEntity,DepartmentDto.class));
	    employeeDto.setProject(this.modelMapper.map(projectEntity, ProjectDto.class));
        EmployeeDetailEntity employeeEntity=this.employeeRepository.save(this.EmployeeDtoToEmployeeDetailEntity(employeeDto));
		return this.EmployeeDetailEntityToEmployeeDto(employeeEntity);

	}

	@Override
	public List<EmployeeDto> getallEmployees() 
	{
		List<EmployeeDetailEntity> employeeRecords=this.employeeRepository.findAll();

		List<EmployeeDto> employeeRecordsDto=employeeRecords.stream().map(employees->this.EmployeeDetailEntityToEmployeeDto(employees)).collect(Collectors.toList());
        return employeeRecordsDto;	
	}
		

	@Override
	public EmployeeDto getEmployeeById(int employeeId) 
	{
		EmployeeDetailEntity employeeRecord = this.employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException2("Employee", "EmployeeId", employeeId));

		return this.EmployeeDetailEntityToEmployeeDto(employeeRecord);

	}

	@Override
	public EmployeeDto updateEmployeeById(EmployeeDto employeeDto, int employeeId) 
	{
		EmployeeDetailEntity employeeRecord = this.employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException2("Employee", "EmployeeId", employeeId));
//		employeeRecord.setEmployeeId(employeeDto.getEmployeeId());
		employeeRecord.setEmployeeFirstName(employeeDto.getEmployeeFirstName());
		employeeRecord.setEmployeeLastName(employeeDto.getEmployeeLastName());
		employeeRecord.setEmployeeAddress(employeeDto.getEmployeeAddress());
		employeeRecord.setEmployeeEmail(employeeDto.getEmployeeEmail());
		employeeRecord.setEmployeeMobileNumber(employeeDto.getEmployeeMobileNumber());
		employeeRecord.setEmployeeBloodGroup(employeeDto.getEmployeeBloodGroup());
		employeeRecord.setEmployeeDesignation(employeeDto.getEmployeeDesignation());
		employeeRecord.setEmployeeSalary(employeeDto.getEmployeeSalary());
		
        EmployeeDetailEntity savedEmployeeRecord=this.employeeRepository.save(employeeRecord);
        return this.EmployeeDetailEntityToEmployeeDto(savedEmployeeRecord);
		
		
	}

	@Override
	public void deleteEmployeeById(int employeeId) 
	{
		EmployeeDetailEntity employeeRecord = this.employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException2("Employee", "EmployeeId", employeeId));
		this.employeeRepository.delete(employeeRecord);
	}
	public EmployeeDetailEntity EmployeeDtoToEmployeeDetailEntity(EmployeeDto employeeDto)
	{
		
		return this.modelMapper.map(employeeDto, EmployeeDetailEntity.class);

	}

	public EmployeeDto EmployeeDetailEntityToEmployeeDto(EmployeeDetailEntity employeedetailEntity) 
	{
		
		return this.modelMapper.map(employeedetailEntity, EmployeeDto.class);
	}
	
	@Override
	public List<EmployeeDto> getAllEmployeeByDept(int departmentId)
	{
		DepartmentEntity departmentEntity = this.departmentRepository.findById(departmentId)
				.orElseThrow(() -> new ResourceNotFoundException2("Department", "DepartmentId", departmentId));
        List<EmployeeDetailEntity> employeedetailEntity=this.employeeRepository.findByDepartment(departmentId);
        List<EmployeeDto> employeeDto=employeedetailEntity.stream().map(employee->this.EmployeeDetailEntityToEmployeeDto(employee)).collect(Collectors.toList());
        return employeeDto;
	}

	

}
