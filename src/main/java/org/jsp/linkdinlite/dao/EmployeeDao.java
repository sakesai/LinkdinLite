package org.jsp.linkdinlite.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.linkdinlite.entity.Employee;
import org.jsp.linkdinlite.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	@Autowired
	private EmployeeRepository repo;
	public Employee saveEmployee(Employee employee) {
		
		return repo.save(employee);
	}
	public List<Employee> findAllEmployees() {
		
		return repo.findAll();
	}
//	public List<Employee> findAllActiveEmployees() {
//		return repo.findAllActiveEmployees();
//	}
	public Optional<Employee> findEmployeeById(int id) {
	
		return repo.findById(id);
	}

}
