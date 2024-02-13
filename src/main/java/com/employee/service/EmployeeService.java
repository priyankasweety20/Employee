package com.employee.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.employee.dao.EmployeeDao;
import com.employee.entity.Employee;
import com.employee.exception.NameNotFoundException;
import com.employee.exception.SalaryException;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao empDao;
	public String addEmployee(Employee e) {
		return empDao.addEmployee(e);
	}
	
	public String addEmployee(List<Employee> e) {
		return empDao.addEmployee(e);
	}
	
	public List<Employee> getdetails() {
		return empDao.getdetails();
	}
	
	public Employee getId(int a){
		return empDao.getId(a);
	}

	public String deleteId(int b) {
		return empDao.deleteId(b);
	}
	
	public String updateDetails(Employee e) {
		return empDao.updateDetails(e);
	}
//	******************************************
	public List<Employee> getBySalary(int s) {
	List<Employee> allEmployee=this.getdetails();//method//by internal in given in findAll//
			return allEmployee.stream().filter(x->x.getSalary()>=s).collect(Collectors.toList());
		
	}
	public Employee getMaxSalary(){
		List<Employee> allEmployee=this.getdetails();
		return allEmployee.stream().max(Comparator.comparingInt(Employee::getSalary)).get();
				
	}
	public Employee getMinSalary() {
		List<Employee> allEmployee=this.getdetails();
		return allEmployee.stream().min(Comparator.comparingInt(Employee::getSalary)).get();
	}
//	************************************
	public String getMin() {//myself
		List<Employee> allEmployee=this.getdetails();
		return allEmployee.stream().min(Comparator.comparingInt(Employee::getSalary)).get().getName();
	}
//	****************************************************
	public List<Employee> getHike() {
		List<Employee> allEmployee=this.getdetails();
		return allEmployee.stream().filter(x->x.getDesignation().equals("manager")).peek(y->y.setSalary((y.getSalary()*5/100)+y.getSalary())).collect(Collectors.toList());
	}
	public List<Employee> getName(String name) {
		List<Employee> allEmployee=this.getdetails();
		return allEmployee.stream().filter(x->x.getName().contains(name)).collect(Collectors.toList());
		
	}
//	************************************************************
	public List<String> Name(String name) {//myself//
		List<Employee> allEmployee=this.getdetails();
		return allEmployee.stream().filter(x->x.getName().contains(name)).map(x->x.getName()).collect(Collectors.toList());
	}
//	******************************************************
	public List<Employee> getGender(String gender) {
		List<Employee> allEmployee=this.getdetails();
		return allEmployee.stream().filter(x->x.getGender().contains(gender)).collect(Collectors.toList());
	}
//	*****************************************************
	public List<Employee> getGenderCaps(String gender) {//myself
		List<Employee> allEmployee=this.getdetails();
		return allEmployee.stream().filter(x->x.getGender().equalsIgnoreCase(gender)).collect(Collectors.toList());
	}
//	**********************************************
	public List<Employee> getDesignation(String d) {
		List<Employee> allEmployee=this.getdetails();
		return allEmployee.stream().filter(x->x.getDesignation().contains(d)).collect(Collectors.toList());
	}
//	***************************************************
	public List<Employee> getBySal(int sal1,int sal2) {//native//
		return empDao.getBySal(sal1, sal2);
	}
	
//	***********************************************
	public List<Employee> getByS(int sal1,int sal2){//jquery//
		return empDao.getBySal(sal1, sal2);
	}
//	*************************************
	public List<Employee> getByName(String name) throws NameNotFoundException {
		List<Employee> allEmployee=empDao.getdetails().stream().filter(x->x.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
		if(allEmployee.isEmpty()) {                                                                                                                                                                
			throw new NameNotFoundException("name not found ");                                                                                                                                         
		}
		else {
			return allEmployee;
		}
	}
//	**************************************
	public String addEmployee1(Employee e) throws SalaryException {//without handle//
		
		
			if(e.getSalary()<50000) {
				throw  new SalaryException("not eligible");
			}
			else {
				return empDao.addEmployee1(e);
			}
		}
		
//		**********************************************
	public String addEmployee2(Employee e) throws SalaryException {//with handle via try,catch,final//
		try {
		if(e.getSalary()<60000) {
			throw new SalaryException("Exception Handled");
			
		}
		else {
			return empDao.addEmployee2(e);
		}
	}
		catch(Exception ex) {
			return ex.getMessage();
		}
		
		
	}
//	*********************************************
	public Employee getId1(int id){
		return empDao.getId(id);
	
}
	
}

