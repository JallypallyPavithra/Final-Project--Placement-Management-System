package com.cg.placementmanagement.Placement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.placementmanagement.Placement.model.Studentlogin;
import com.cg.placementmanagement.Placement.repository.StudentLoginRepository;

@Service
public class StudentLoginService {
	
	@Autowired
	private StudentLoginRepository repo;
 
	public Studentlogin StudentLogin(String username, String password) {
		 Studentlogin user1 = repo.findByUsernameAndPassword(username, password);
		  	return user1;
	  }
}