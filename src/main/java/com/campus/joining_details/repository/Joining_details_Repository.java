package com.campus.joining_details.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.campus.joining_details.domain.Joining_details;

@Repository
public interface Joining_details_Repository extends JpaRepository<Joining_details, Integer>{

	@Query("Select j.joining_details_code from Joining_details j where"
			+ " j.joining_fy_as_fte=:join.joining_fy_as_fte "
			+ "and fte_joining_date=:join.fte_joining_date"
			+ "and pls_joining_date=:join.pls_joining_date and "
			+ "joining_psl=:join.joining_psl and wfo_date=:join.wfo_date"
			+ "and base_location=:join.base_location")
	public Integer idIfJoiningObjExists(@Param("join")Joining_details join);
}
