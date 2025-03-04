package org.jsp.linkdinlite.service;

import java.util.Optional;

import org.jsp.linkdinlite.dao.AddressDao;
import org.jsp.linkdinlite.dao.EmployeeDao;
import org.jsp.linkdinlite.entity.Address;
import org.jsp.linkdinlite.entity.Education;
import org.jsp.linkdinlite.entity.Employee;
import org.jsp.linkdinlite.responsestructure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServicee {

	@Autowired
	private AddressDao addressDao;
	
	@Autowired
	private EmployeeDao employeeDao;
	
//	public ResponseStructure<Address> saveAddress(Address address, int id) {
//		
//		Optional<Employee> optional = employeeDao.findEmployeeById(id);
//		if (optional.isEmpty()) {
//			// throw new InvalidEmployeeIdException();
//		}
//		Employee employee = optional.get();
//
//		employee.setEmployee(employee);
//
//		employee = addressDao.saveEducation(education);
//		ResponseStructure<Education> structure = new ResponseStructure<>();
//		structure.setStatus(200);
//		structure.setMessage("Education Saved Successfully");
//		structure.setBody(education);
//		return structure;
//	}

}
