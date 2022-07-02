package com.employeeapp.controller;

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

import com.employeeapp.Service.AdminService;
import com.employeeapp.exception.ApiResponse1;
import com.employeeapp.payload.AdminDto;

@RestController
@RequestMapping("/api")
public class AdminController 
{
	@Autowired
	AdminService adminService;

	// To create a admin
	@PostMapping("/admin")
	public ResponseEntity<AdminDto> createAdmin(@Valid @RequestBody AdminDto adminDto) 
	{
		AdminDto createadmin = this.adminService.createAdmin(adminDto);
		return new ResponseEntity<AdminDto>(createadmin, HttpStatus.CREATED);
	}

	// To fetch a particular admin by admin Id
	@GetMapping("/admin/{adminId}")
	public ResponseEntity<AdminDto> getAdmin(@PathVariable int adminId) 
	{
		AdminDto getadmin = this.adminService.getAdmin(adminId);

		return new ResponseEntity<AdminDto>(getadmin, HttpStatus.OK);

	}

	// To fetch all the admin list
	@GetMapping("/admins")
	public ResponseEntity<List<AdminDto>> getAllAdmin() 
	{
		List<AdminDto> adminList = this.adminService.getAllAdmin();
		return new ResponseEntity<List<AdminDto>>(adminList, HttpStatus.OK);
	}

	// To update a admin by adminId
	@PutMapping("/admin/{adminId}")
	public ResponseEntity<AdminDto> updateAdminById(@RequestBody AdminDto admin, @PathVariable int adminId) 
	{
		AdminDto updateadmin = this.adminService.updateAdminById(admin, adminId);
		return new ResponseEntity<AdminDto>(updateadmin, HttpStatus.OK);
	}

	// To delete admin by Id
	@DeleteMapping("/admin/{adminId}")
	public ResponseEntity<ApiResponse1> deleteAdminById(@PathVariable int adminId) 
	{
		this.adminService.deleteAdminById(adminId);
		return new ResponseEntity<ApiResponse1>(new ApiResponse1("Admin details are successfully deleted", true),
				HttpStatus.OK);
	}

}
