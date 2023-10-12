package com.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Repository.EmployeeRepository;
import com.entity.Employee;
import com.service.EmployeeService;
@Service
public class EmployeeServiceImp implements EmployeeService{
	@Autowired
	EmployeeRepository empRepo;
	
	public List<Employee>getAll(){
		return empRepo.findAll();
	}

	@Override
	public void saveEmp(Employee e) {
		empRepo.save(e);
	}

	@Override
	public Employee getEmpById(int id) {
		return empRepo.findById(id).get();
	}

	@Override
	public void update(Employee e) {
		empRepo.save(e);
	}

	@Override
	public void delete(int id) {
		empRepo.deleteById(id);;		
	}
}
