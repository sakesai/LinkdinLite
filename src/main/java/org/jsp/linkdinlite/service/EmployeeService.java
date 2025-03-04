package org.jsp.linkdinlite.service;

import java.util.List;
import java.util.Optional;

import org.jsp.linkdinlite.dao.EmployeeDao;
import org.jsp.linkdinlite.entity.Employee;
import org.jsp.linkdinlite.responsestructure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao dao;
	public ResponseStructure<Employee> saveEmployee(Employee employee) {
		
		employee = dao.saveEmployee(employee);

		ResponseStructure<Employee> structure = new ResponseStructure<>();
		structure.setStatus(200);
		structure.setMessage("Employee Saved Successfully");
		structure.setBody(employee);
		return structure;
	}
	public ResponseStructure<List<Employee>> findAllEmployees() {
		
		List<Employee> emps = dao.findAllEmployees();
		if (emps.isEmpty()) {
//			throw new NoEmployeeFoundException();
		}
		ResponseStructure<List<Employee>> structure = new ResponseStructure<>();
		structure.setStatus(200);
		structure.setMessage("All Employees Found Successfully");
		structure.setBody(emps);
		return structure;
	}
//	public ResponseStructure<List<Employee>> findAllActiveEmployees() {
//		List<Employee> emps = dao.findAllActiveEmployees();
//		if (emps.isEmpty()) {
////			throw new NoEmployeeFoundException();
//		}
//		ResponseStructure<List<Employee>> structure = new ResponseStructure<>();
//		structure.setStatus(200);
//		structure.setMessage("All Employees Found Successfully");
//		structure.setBody(emps);
//		return structure;
//	}
	public ResponseStructure<Employee> findEmployeeById(int id) {
		
		Optional<Employee> optional = dao.findEmployeeById(id);
		if (optional.isEmpty()) {
//			throw new InvalidEmployeeIdException();
		}
		Employee employee = optional.get();
		ResponseStructure<Employee> structure = new ResponseStructure<>();
		structure.setStatus(200);
		structure.setMessage("Employyee Found Successfully");
		structure.setBody(employee);
		return structure;
	}

}
