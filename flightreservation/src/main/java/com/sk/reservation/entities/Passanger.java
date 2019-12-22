package com.sk.reservation.entities;

/***********************************************************************
 * History.
 * 
 * 21.12.2019 created
 **********************************************************************/
import javax.persistence.Entity;

/**
 * 
 * @author Santosh Korade
 *
 */
@Entity
public class Passanger extends BaseEntity {

	private String firstname;

	private String lastname;

	private String middlename;

	private String email;

	private String phone;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
