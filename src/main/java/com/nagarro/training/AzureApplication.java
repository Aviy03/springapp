package com.nagarro.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureApplication {
	@Autowired
	private EmployeeDao dao;

	@GetMapping("/home")
	public String Home() {
		return "Hi!" + "Spring boot Application successfully deployed on azure cloud";
	}

	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return dao.save(employee);
	}

	@GetMapping("/getEmp")
	public List<Employee> getEmployee() {
		return dao.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureApplication.class, args);
	}

}
