package org.jsp.linkdinlite.repository;

import java.util.List;

import org.jsp.linkdinlite.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

//	List<Employee> findAllActiveEmployees();

//	List<Employee> findByActiveTrue();

}
