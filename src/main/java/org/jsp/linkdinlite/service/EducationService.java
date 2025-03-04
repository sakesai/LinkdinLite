package org.jsp.linkdinlite.service;

import java.util.Optional;

import org.jsp.linkdinlite.dao.EducationDao;
import org.jsp.linkdinlite.dao.EmployeeDao;
import org.jsp.linkdinlite.entity.Education;
import org.jsp.linkdinlite.entity.Employee;
import org.jsp.linkdinlite.responsestructure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService {

	@Autowired
	private EducationDao educationDao;
	
	@Autowired
	private EmployeeDao employeeDao;
	
	public ResponseStructure<Education> saveEducation(Education education, int id) {
		Optional<Employee> optional = employeeDao.findEmployeeById(id);
		if (optional.isEmpty()) {
			// throw new InvalidEmployeeIdException();
		}
		Employee employee = optional.get();

		education.setEmployee(employee);

		education = educationDao.saveEducation(education);
		ResponseStructure<Education> structure = new ResponseStructure<>();
		structure.setStatus(200);
		structure.setMessage("Education Saved Successfully");
		structure.setBody(education);
		return structure;
	}

	
}
