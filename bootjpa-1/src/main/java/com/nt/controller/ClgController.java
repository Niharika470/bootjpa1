package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.College;
import com.nt.service.ClgService;

@RestController
public class ClgController {
	
	@Autowired
	private ClgService clgService;

	@GetMapping(value="/clg/{id}")
	public College getClgDetails(@PathVariable(value="id")int id) {
		System.out.println("ClgController.getClgDetails()"+id);
		return clgService.getClgDetails(id);
	}
	

}
