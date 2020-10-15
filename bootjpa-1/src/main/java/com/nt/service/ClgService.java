package com.nt.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.College;
import com.nt.repo.CollegeRepo;

@Service
@Transactional
public class ClgService  {
	@Autowired
	private CollegeRepo collegeRepo;
	
	public College getClgDetails(int clgid) {
		return  collegeRepo.findById(clgid).get();
	}

	
	

	
	
}
