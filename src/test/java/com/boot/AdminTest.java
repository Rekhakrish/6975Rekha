package com.boot;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;

import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.employeeApp.entity.AdminEntity;
import com.employeeApp.repository.AdminRepository;


@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdminTest {
	@Autowired
	private AdminRepository adminRepository;

	@Test
	@Order(1)
	public void savedAdminTest() {
		AdminEntity admin = AdminEntity.builder().adminName("Rekha").adminEmail("rekha@gmail.com")
				.password("12345").build();
		adminRepository.save(admin);
		Assertions.assertThat(admin.getAdminId()).isGreaterThan(0);
	}

	@Test
	@Order(2)
	public void getAdminByIdTest() {
		AdminEntity admin = adminRepository.findById(1).get();
		Assertions.assertThat(admin.getAdminId()).isEqualTo(1);
	}

	@Test
	@Order(3)
	public void updateAdminTest() {
		AdminEntity admin = adminRepository.findById(1).get();
		admin.setAdminName("Shar");
		admin.setAdminEmail("Shar@gmail.com");
		admin.setPassword("shar9");
		AdminEntity updatedAdmin = adminRepository.save(admin);
		Assertions.assertThat(updatedAdmin.getAdminId()).isEqualTo(1);
	}

	@Test
	@Order(4)
	public void getAllAdminTest() {
		List<AdminEntity> adminList = adminRepository.findAll();
		Assertions.assertThat(adminList.size()).isGreaterThan(0);
	}

}