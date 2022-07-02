package com.employeeapp.serviceimplementation;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeapp.Service.EmployeeService;
import com.employeeapp.entity.DepartmentEntity;
import com.employeeapp.entity.EmployeeEntity;
import com.employeeapp.entity.ProjectEntity;
import com.employeeapp.exception.ResourceNotFoundException2;
import com.employeeapp.payload.DepartmentDto;
import com.employeeapp.payload.EmployeeDto;
import com.employeeapp.payload.ProjectDto;
import com.employeeapp.repository.DepartmentRepository;
import com.employeeapp.repository.EmployeeRepository;
import com.employeeapp.repository.ProjectRepository;

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
	public EmployeeDto addEmployeeDetails(EmployeeDto employeeDto, int departmentId, int projectId) 
	{
		DepartmentEntity departmentEntity = this.departmentRepository.findById(departmentId)
				.orElseThrow(() -> new ResourceNotFoundException2("Department", "DepartmentId", departmentId));
		ProjectEntity projectEntity = this.projectRepository.findById(projectId)
				.orElseThrow(() -> new ResourceNotFoundException2("Project", "ProjectId", projectId));
		employeeDto.setDepartment(this.modelMapper.map(departmentEntity, DepartmentDto.class));
		employeeDto.setProject(this.modelMapper.map(projectEntity, ProjectDto.class));
		EmployeeEntity employeeEntity = this.employeeRepository
				.save(this.EmployeeDtoToEmployeeDetailEntity(employeeDto));
		return this.EmployeeDetailEntityToEmployeeDto(employeeEntity);

	}

	@Override
	public List<EmployeeDto> getallEmployees() 
	{
		List<EmployeeEntity> employeeRecords = this.employeeRepository.findAll();

		List<EmployeeDto> employeeRecordsDto = employeeRecords.stream()
				.map(employees -> this.EmployeeDetailEntityToEmployeeDto(employees)).collect(Collectors.toList());
		return employeeRecordsDto;
	}

	@Override
	public EmployeeDto getEmployeeById(int employeeId) 
	{
		EmployeeEntity employeeRecord = this.employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException2("Employee", "EmployeeId", employeeId));

		return this.EmployeeDetailEntityToEmployeeDto(employeeRecord);

	}

	@Override
	public EmployeeDto updateEmployeeById(EmployeeDto employeeDto, int employeeId) 
	{
		EmployeeEntity employeeRecord = this.employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException2("Employee", "EmployeeId", employeeId));
		employeeRecord.setEmployeeId(employeeDto.getEmployeeId());
		employeeRecord.setEmployeeFirstName(employeeDto.getEmployeeFirstName());
		employeeRecord.setEmployeeLastName(employeeDto.getEmployeeLastName());
		employeeRecord.setEmployeeAddress(employeeDto.getEmployeeAddress());
		employeeRecord.setEmployeeEmail(employeeDto.getEmployeeEmail());
		employeeRecord.setEmployeeMobileNumber(employeeDto.getEmployeeMobileNumber());
		employeeRecord.setEmployeeBloodGroup(employeeDto.getEmployeeBloodGroup());
		employeeRecord.setEmployeeDesignation(employeeDto.getEmployeeDesignation());
		employeeRecord.setEmployeeSalary(employeeDto.getEmployeeSalary());

		EmployeeEntity savedEmployeeRecord = this.employeeRepository.save(employeeRecord);
		return this.EmployeeDetailEntityToEmployeeDto(savedEmployeeRecord);

	}

	@Override
	public void deleteEmployeeById(int employeeId) 
	{
		EmployeeEntity employeeRecord = this.employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException2("Employee", "EmployeeId", employeeId));
		this.employeeRepository.delete(employeeRecord);
	}

	public EmployeeEntity EmployeeDtoToEmployeeDetailEntity(EmployeeDto employeeDto) 
	{

		return this.modelMapper.map(employeeDto, EmployeeEntity.class);

	}

	public EmployeeDto EmployeeDetailEntityToEmployeeDto(EmployeeEntity employeedetailEntity) 
	{

		return this.modelMapper.map(employeedetailEntity, EmployeeDto.class);
	}

	@Override
	public List<EmployeeDto> getAllEmployeeByDept(int departmentId) 
	{
		DepartmentEntity departmentEntity = this.departmentRepository.findById(departmentId)
				.orElseThrow(() -> new ResourceNotFoundException2("Department", "DepartmentId", departmentId));
		List<EmployeeEntity> employeedetailEntity = this.employeeRepository.findByDepartment(departmentEntity);
		List<EmployeeDto> employeeDto = employeedetailEntity.stream()
				.map(employee -> this.EmployeeDetailEntityToEmployeeDto(employee)).collect(Collectors.toList());
		return employeeDto;
	}

	@Override
	public List<EmployeeDto> getAllEmployeeByProject(int projectId) 
	{
		ProjectEntity projectEntity = this.projectRepository.findById(projectId)
				.orElseThrow(() -> new ResourceNotFoundException2("Project", "ProjectId", projectId));
		List<EmployeeEntity> employeeEntity = this.employeeRepository.findByProject(projectEntity);
		List<EmployeeDto> employeeDto = employeeEntity.stream()
				.map(employees -> this.EmployeeDetailEntityToEmployeeDto(employees)).collect(Collectors.toList());
		return employeeDto;
	}

}
