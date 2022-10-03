package com.campus.joining_details.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.campus.joining_details.domain.Joining_details;
import com.campus.joining_details.repository.Joining_details_Repository;

@RestController
public class Joining_details_Controller {
	
	@Autowired
	private Joining_details_Repository joining_details_Repo;
	
	//Save
	public Joining_details saveJoinDetails(Joining_details join_details){
		return joining_details_Repo.save(join_details);
	}
	 
	// Read operation
	public Joining_details fetchDetail(@PathVariable Integer joining_details_code){
	    return joining_details_Repo.findById(joining_details_code).orElse(null);
	}
	 
	// Update operation
	public Joining_details updateDepartment(@PathVariable Integer joining_details_code,Joining_details join_details){
		joining_details_Repo.deleteById(joining_details_code);
	    return joining_details_Repo.save(join_details);
	}
	 
	// Delete operation
	public void deleteJoinDetail(@PathVariable Integer joining_details_code ){
		joining_details_Repo.deleteById(joining_details_code);
	}
		
}
