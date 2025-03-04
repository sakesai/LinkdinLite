package org.jsp.linkdinlite.controller;

import org.jsp.linkdinlite.entity.Address;
import org.jsp.linkdinlite.responsestructure.ResponseStructure;
import org.jsp.linkdinlite.service.AddressServicee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressContoller {

	@Autowired
	private AddressServicee service;
	
//	@PostMapping
//	public ResponseStructure<Address> saveAddress(@RequestBody Address address, @PathVariable int id)
//	{
//		return service.saveAddress(address,id);
//	}
}
