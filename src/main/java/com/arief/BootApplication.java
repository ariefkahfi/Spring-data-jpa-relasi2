package com.arief;

import com.entity.City;
import com.entity.Department;
import com.entity.Employee;
import com.services.CityRepository;
import com.services.DepartmentRepository;
import com.services.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@SpringBootApplication
@EntityScan("com.entity")
@EnableJpaRepositories(basePackages = {"com.services"})
@EnableTransactionManagement
public class BootApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository empRepo;
	@Autowired
	private DepartmentRepository deptRepo;
	@Autowired
	private CityRepository cityRepo;


	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}

	@Transactional
	@Override
	public void run(String... strings) throws Exception {





	}
}
