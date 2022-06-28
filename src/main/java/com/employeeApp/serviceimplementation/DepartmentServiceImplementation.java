package com.employeeApp.serviceimplementation;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeApp.Service.DepartmentService;
import com.employeeApp.entity.AdminEntity;
import com.employeeApp.entity.DepartmentEntity;
import com.employeeApp.entity.EmployeeDetailEntity;
import com.employeeApp.entity.ProjectEntity;
import com.employeeApp.exception.ResourceNotFoundException2;
import com.employeeApp.payload.AdminDto;
import com.employeeApp.payload.DepartmentDto;
import com.employeeApp.payload.EmployeeDto;
import com.employeeApp.repository.AdminRepository;
import com.employeeApp.repository.DepartmentRepository;

@Service
public class DepartmentServiceImplementation implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	ModelMapper modelmapper;

	@Override
	public DepartmentDto createEmployeeDepartment(DepartmentDto departmentDto,int adminId)
	{
		AdminEntity adminEntity = this.adminRepository.findById(adminId)
				.orElseThrow(() -> new ResourceNotFoundException2("Admin", "AdminId", adminId));
		departmentDto.setAdmin(this.modelmapper.map(adminEntity, AdminDto.class));
		DepartmentEntity departmentEntity=this.DepartmentDtoToDepartmentEntity(departmentDto);
		 DepartmentEntity savedDepartment=this.departmentRepository.save(departmentEntity);
        		return this.DepartmentEntityToDepartmentDto(savedDepartment);
	}

	@Override
	public List<DepartmentDto> getallDepartments() {
		List<DepartmentEntity> departmentList = this.departmentRepository.findAll();
		List<DepartmentDto> departmentDtoList = departmentList.stream()
				.map(department -> this.DepartmentEntityToDepartmentDto(department)).collect(Collectors.toList());
		return departmentDtoList;
	}

	@Override
	public DepartmentDto getDepartmentById(int departmentId) {
		DepartmentEntity departmentEntity = this.departmentRepository.findById(departmentId)
				.orElseThrow(() -> new ResourceNotFoundException2("Department", "DepartmentId", departmentId));

		return this.DepartmentEntityToDepartmentDto(departmentEntity);

	}

	@Override
	public DepartmentDto updateDepartmentById(DepartmentDto departmentDto, int departmentId) {
		DepartmentEntity departmentEntity = this.departmentRepository.findById(departmentId)
				.orElseThrow(() -> new ResourceNotFoundException2("Department", "DepartmentId", departmentId));
		departmentEntity.setDepartmentId(departmentId);
		departmentEntity.setDepartmentName(departmentDto.getDepartmentName());
		return this.DepartmentEntityToDepartmentDto(departmentEntity);
	}

	@Override
	public void deleteDepartmentById(int departmentId) {
		DepartmentEntity departmentEntity = this.departmentRepository.findById(departmentId)
				.orElseThrow(() -> new ResourceNotFoundException2("Department", "DepartmentId", departmentId));
		this.departmentRepository.delete(departmentEntity);

	}

	public DepartmentEntity DepartmentDtoToDepartmentEntity(DepartmentDto departmentDto) {
		DepartmentEntity departmentEntity = new DepartmentEntity();
		departmentEntity.setDepartmentId(departmentDto.getDepartmentId());
		departmentEntity.setDepartmentName(departmentDto.getDepartmentName());

		return departmentEntity;

	}

	public DepartmentDto DepartmentEntityToDepartmentDto(DepartmentEntity departmentEntity) {
		DepartmentDto departmentDto = new DepartmentDto();
		departmentDto.setDepartmentId(departmentEntity.getDepartmentId());
		departmentDto.setDepartmentName(departmentEntity.getDepartmentName());

		return departmentDto;
	}

	@Override
	public List<DepartmentDto> getAllDepartmentByAdmin(int adminId) 
	{
		AdminEntity adminEntity = this.adminRepository.findById(adminId)
				.orElseThrow(() -> new ResourceNotFoundException2("Admin", "AdminId", adminId));
		List<DepartmentEntity> departmentList = this.departmentRepository.findByAdmin(adminEntity);
		List<DepartmentDto> departmentDtoList = departmentList.stream()
				.map(department -> this.modelmapper.map(department, DepartmentDto.class)).collect(Collectors.toList());
		return departmentDtoList;
	}

}
