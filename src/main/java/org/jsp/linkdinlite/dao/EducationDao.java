package org.jsp.linkdinlite.dao;

import org.jsp.linkdinlite.entity.Education;
import org.jsp.linkdinlite.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;

@Repository
public class EducationDao {

	@Autowired
	private EducationRepository repo;
	public Education saveEducation(Education education) {
		
		return repo.save(education);
	}

}
