package com.service;

import java.util.List;


import com.entity.Employee;


public interface EmployeeService {
	List<Employee> getAll();
	
	void saveEmp(Employee e);
	
	Employee getEmpById(int id);
	
	void update(Employee e);
	
	void delete(int id);
}
