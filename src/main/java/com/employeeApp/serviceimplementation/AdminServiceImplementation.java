package com.employeeapp.serviceimplementation;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeapp.Service.AdminService;
import com.employeeapp.entity.AdminEntity;
import com.employeeapp.exception.ResourceNotFoundException2;
import com.employeeapp.payload.AdminDto;
import com.employeeapp.repository.AdminRepository;

@Service
public class AdminServiceImplementation implements AdminService
{
	@Autowired
	AdminRepository adminRepository;

	@Autowired
	ModelMapper modelMapper;

	@Override
	public AdminDto createAdmin(AdminDto admin) 
	{
		AdminEntity adminEntity = this.modelMapper.map(admin, AdminEntity.class);
		AdminEntity savedAdmin = this.adminRepository.save(adminEntity);
		return this.modelMapper.map(savedAdmin, AdminDto.class);
	}

	@Override
	public AdminDto getAdmin(int adminId) 
	{
		AdminEntity adminEntity = this.adminRepository.findById(adminId)
				.orElseThrow(() -> new ResourceNotFoundException2("Admin", "AdminId", adminId));
		return this.modelMapper.map(adminEntity, AdminDto.class);
	}

	@Override
	public AdminDto updateAdminById(AdminDto adminDto, int adminId) 
	{
		AdminEntity adminEntity = this.adminRepository.findById(adminId)
				.orElseThrow(() -> new ResourceNotFoundException2("Admin", "AdminId", adminId));
		AdminEntity updatedAdmin = this.modelMapper.map(adminDto, AdminEntity.class);
		AdminEntity savedAdmin = this.adminRepository.save(updatedAdmin);
		return this.modelMapper.map(savedAdmin, AdminDto.class);
	}

	@Override
	public void deleteAdminById(int adminId) 
	{
		AdminEntity adminEntity = this.adminRepository.findById(adminId)
				.orElseThrow(() -> new ResourceNotFoundException2("Admin", "AdminId", adminId));
		this.adminRepository.delete(adminEntity);

	}

	@Override
	public List<AdminDto> getAllAdmin() 
	{
		List<AdminDto> adminList = this.adminRepository.findAll().stream()
				.map(admin -> this.modelMapper.map(admin, AdminDto.class)).collect(Collectors.toList());

		return adminList;
	}

}
