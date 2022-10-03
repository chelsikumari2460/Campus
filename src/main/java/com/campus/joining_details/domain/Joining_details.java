package com.campus.joining_details.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Joining_details {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer joining_details_code;

	@Column(length = 100)
	private String joining_fy_as_fte;

	private Date fte_joining_date;

	private Date pls_joining_date;

	@Column(length = 100)
	private String joining_psl;

	private Date wfo_date;

	@Column(length = 100)
	private String base_location;

	public Joining_details() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Joining_details(Integer joining_details_code, String joining_fy_as_fte, Date fte_joining_date,
			Date pls_joining_date, String joining_psl, Date wfo_date, String base_location) {
		super();
		this.joining_details_code = joining_details_code;
		this.joining_fy_as_fte = joining_fy_as_fte;
		this.fte_joining_date = fte_joining_date;
		this.pls_joining_date = pls_joining_date;
		this.joining_psl = joining_psl;
		this.wfo_date = wfo_date;
		this.base_location = base_location;
	}

	public Integer getJoining_details_code() {
		return joining_details_code;
	}

	public void setJoining_details_code(Integer joining_details_code) {
		this.joining_details_code = joining_details_code;
	}

	public String getJoining_fy_as_fte() {
		return joining_fy_as_fte;
	}

	public void setJoining_fy_as_fte(String joining_fy_as_fte) {
		this.joining_fy_as_fte = joining_fy_as_fte;
	}

	public Date getFte_joining_date() {
		return fte_joining_date;
	}

	public void setFte_joining_date(Date fte_joining_date) {
		this.fte_joining_date = fte_joining_date;
	}

	public Date getPls_joining_date() {
		return pls_joining_date;
	}

	public void setPls_joining_date(Date pls_joining_date) {
		this.pls_joining_date = pls_joining_date;
	}

	public String getJoining_psl() {
		return joining_psl;
	}

	public void setJoining_psl(String joining_psl) {
		this.joining_psl = joining_psl;
	}

	public Date getWfo_date() {
		return wfo_date;
	}

	public void setWfo_date(Date wfo_date) {
		this.wfo_date = wfo_date;
	}

	public String getBase_location() {
		return base_location;
	}

	public void setBase_location(String base_location) {
		this.base_location = base_location;
	}

}
