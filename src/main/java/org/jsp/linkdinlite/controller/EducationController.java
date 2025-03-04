package org.jsp.linkdinlite.controller;

import org.jsp.linkdinlite.entity.Education;
import org.jsp.linkdinlite.responsestructure.ResponseStructure;
import org.jsp.linkdinlite.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducationController {

	@Autowired
	private EducationService service;
	
	@PostMapping("/educations/{id}")
	public ResponseStructure<Education> saveEducation(@RequestBody Education education, @PathVariable int id)
	{
		return service.saveEducation(education,id);
	}
}
