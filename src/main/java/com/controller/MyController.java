package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.Repository.EmployeeRepository;
import com.entity.Employee;
import com.service.EmployeeService;
import com.service.imp.EmployeeServiceImp;

@Controller
public class MyController {
	@Autowired
	EmployeeServiceImp empService;
	
	@GetMapping("/allEmp")
	public String getHomePage(Model m) {
		m.addAttribute("empData",empService.getAll());
		return "Employee";
	}
	
	@GetMapping("/newEmp")
	public String newEmp(Model m) {
		m.addAttribute("newEmp",new Employee());
		return "newEmp";
	}
	
	@PostMapping("/addEmp")
	public String addEmp(@ModelAttribute("newEmp")Employee e) {
		empService.saveEmp(e);
		return "redirect:/allEmp";
	}
	
	@GetMapping("/update/{id}")
	public String updateStude(@PathVariable int id,Model m) {
		m.addAttribute("emp",empService.getEmpById(id));
		return "Update";
	}
	
	@PostMapping("/updatedEmp/{id}")
	public String updated(@PathVariable int id,@ModelAttribute("emp")Employee e) {
		
		Employee old=empService.getEmpById(id);
		old.setDept(e.getDept());
		old.setId(e.getId());
		old.setName(e.getName());
		
		empService.update(old);
		
		return "redirect:/allEmp";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		empService.delete(id);
		return "redirect:/allEmp";
	}
}
