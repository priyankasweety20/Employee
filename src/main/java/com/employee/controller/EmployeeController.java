package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.exception.NameNotFoundException;
import com.employee.exception.SalaryException;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
	@Autowired
	EmployeeService empser;

	@PostMapping(value = "/insert")
	public String addEmployee(@RequestBody Employee e) {
		return empser.addEmployee(e);
	}

	@PostMapping(value = "/insertingAll")
	public String addEmployee(@RequestBody List<Employee> e) {
		return empser.addEmployee(e);

	}

	@GetMapping(value = "/getDetails")
	public List<Employee> getdetails() {
		return empser.getdetails();
	}

	@GetMapping(value = "/getId/{a}")
	public Employee getId(@PathVariable int a) {
		return empser.getId(a);
	}

	@DeleteMapping(value = "/deleteId/{b}")
	public String deleteId(@PathVariable int b) {
		return empser.deleteId(b);
	}

	@PutMapping(value = "/updateDetails")
	public String updateDetails(@RequestBody Employee e) {
		return empser.updateDetails(e);
	}

//	***********************************************
	@GetMapping(value = "/getBySalary/{s}")
	public List<Employee> getBySalary(@PathVariable int s) {
		return empser.getBySalary(s);
	}

	@GetMapping(value = "/getMaxSalary")
	public Employee getMaxSalary() {
		return empser.getMaxSalary();
	}

	@GetMapping(value = "/getMinSalary")
	public Employee getMinSalary() {
		return empser.getMinSalary();
	}

//	****************************************
	@GetMapping(value = "/getMin") // myself
	public String getMin() {
		return empser.getMin();
	}

//	*******************************************
	@GetMapping(value = "/hike")
	public List<Employee> getHike() {
		return empser.getHike();
	}

	@GetMapping(value = "/getName/{name}")
	public List<Employee> getName(@PathVariable String name) {
		return empser.getName(name);
	}

//	*************************************
	@GetMapping(value = "/Name/{name}") // myself//
	public List<String> Name(@PathVariable String name) {
		return empser.Name(name);
	}

	@GetMapping(value = "/getGender/{gender}")
	public List<Employee> getGender(@PathVariable String gender) {
		return empser.getGender(gender);
	}

//	************************************
	@GetMapping(value = "/getGenderCaps/{gender}") // myself
	public List<Employee> getGenderCaps(@PathVariable String gender) {
		return empser.getGenderCaps(gender);
	}

//	************************************
	@GetMapping(value = "/getDesignation/{d}")
	public List<Employee> getDesignation(@PathVariable String d) {
		return empser.getDesignation(d);
	}
//	**************************************************
	// connect db using query inrepository//

	@GetMapping(value = "/getBySal/{sal1}/{sal2}") // native//
	public List<Employee> getBySal(@PathVariable int sal1, @PathVariable int sal2) {
		return empser.getBySal(sal1, sal2);

	}

//	******************************
	@GetMapping(value = "/getByS/{sal1}/{sal2}") // jquery//
	public List<Employee> getByS(@PathVariable int sal1, @PathVariable int sal2) {
		return empser.getBySal(sal1, sal2);
	}

//	*********************************************
	@GetMapping(value = "getByName/{name}") // Exception//
	public List<Employee> getByName(@PathVariable String name) throws NameNotFoundException {
		return empser.getByName(name);
	}

//	*****************************************
	@PostMapping(value = "addEmployee1") // post exception//
	public String addEmployee1(Employee e) throws SalaryException {
		return empser.addEmployee1(e);
	}

//	***********************************
	@PostMapping(value = "addEmployee2")
	public String addEmployee2(Employee e) throws SalaryException {
		return empser.addEmployee2(e);
	}

//	****************************************
	@GetMapping(value = "getId1/{id}")
	public Employee getId1(@PathVariable int id) {
		return empser.getId1(id);
	}

//	*************************************************
//	@value in feid level

	// public class Sample {
		
		@Value("${my.name}")
		String name;

		@GetMapping(value = "/getName")
		public String getThis() {
			return name;
		}
	//}
//	*********************************************
//	@Value in method level

	 //public class Emp {
		int age;

		// setter method
		@Value("${my.age}")
		public void setAge(int age) {
			this.age = age;
		}

		@GetMapping(value = "/getAge")
		public int getAge() {
			return age;

		}
	}

	


