package com.employee.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;
import com.employee.exception.NameNotFoundException;
import com.employee.repository.EmployeeRepository;


@Repository

public class EmployeeDao {

	@Autowired
	EmployeeRepository empRepo;
	public String addEmployee(Employee e) {
		empRepo.save(e);
		return "Sucessfully Saved";
	}
	
	public String addEmployee(List<Employee> e) {
		empRepo.saveAll(e);
		return " saved sucessfully";
	}
	
	public List<Employee>getdetails() {
		return empRepo.findAll();
	}
	public Employee getId(int a){
		return empRepo.findById(a).get();
	}
	public String deleteId(int b) {
		 empRepo.deleteById(b);
		 return "Deleted Sucessfully";
	}
	
	public String updateDetails(Employee e) {
		empRepo.save(e);
		return "Updated Sucessfully";
	}
//	*******************************
	public List<Employee> getBySal(int sal1,int sal2){//native//
		return empRepo.getBySal(sal1, sal2);
	}
//	**********************************
	public List<Employee> getByS(int sal1,int sal2){//query//
		return empRepo.getByS(sal1, sal2);
	}
//	************************************
	public String addEmployee1(Employee e) {//exception
		empRepo.save(e);
		return "Sucessfully Saved";
	}
//	******************************
	public String addEmployee2(Employee e) {//exception handled//
		empRepo.save(e);
		return "sucess";
	}
//	***********************************
	public Employee getId1(int id) {//exception nosuchelement// and handle pana no value present//
		return empRepo.findById(id).get();
	}
	}

