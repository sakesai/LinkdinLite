package org.jsp.linkdinlite.controller;

import java.util.List;

import org.jsp.linkdinlite.entity.Employee;
import org.jsp.linkdinlite.responsestructure.ResponseStructure;
import org.jsp.linkdinlite.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService service ;
	
	@PostMapping
	public ResponseStructure<Employee> saveEmployee(@RequestBody Employee employee){
		return service.saveEmployee(employee);
	}
	
	
	@GetMapping
	public ResponseStructure<List<Employee>> findAllEmployees(){
		return service.findAllEmployees();
	}
	
//	@GetMapping("/status/active")
//	public ResponseStructure<List<Employee>> findAllActiveEmployees(){
//		return service.findAllActiveEmployees();
//	}
//	
	@GetMapping("/{id}")
	public ResponseStructure<Employee> findEmployeeById(@PathVariable int id){
		return service.findEmployeeById(id);
	}
}
