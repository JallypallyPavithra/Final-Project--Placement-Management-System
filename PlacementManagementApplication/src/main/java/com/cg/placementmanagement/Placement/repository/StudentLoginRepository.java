package com.cg.placementmanagement.Placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.placementmanagement.Placement.model.Studentlogin;

public interface StudentLoginRepository extends JpaRepository<Studentlogin, Long>{
	Studentlogin findByUsernameAndPassword(String username, String password);

}

