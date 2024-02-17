package com.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "user")
public class User {

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(name = "usr_name")
	private String uname;
	
	@Column(name = "user_gmail")
	private String ugmail;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "usr_age")
	private int uage;
	
	@Column(name = "is_avvailable")
	private int is_avvailable;
	
	@Column(name = "createdby")
	private String createdby;
	
	@Column(name = "modifiedby")
	private String modifiedby;
	
	@Column(name = "last_modification")
	private String last_modification;

	public User() {
		super();
	}

	public User(int id, String uname, String ugmail, String password, int uage, int is_avvailable, String createdby,
			String modifiedby, String last_modification) {
		super();
		Id = id;
		this.uname = uname;
		this.ugmail = ugmail;
		this.password = password;
		this.uage = uage;
		this.is_avvailable = is_avvailable;
		this.createdby = createdby;
		this.modifiedby = modifiedby;
		this.last_modification = last_modification;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUgmail() {
		return ugmail;
	}

	public void setUgmail(String ugmail) {
		this.ugmail = ugmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUage() {
		return uage;
	}

	public void setUage(int uage) {
		this.uage = uage;
	}

	public int getIs_avvailable() {
		return is_avvailable;
	}

	public void setIs_avvailable(int is_avvailable) {
		this.is_avvailable = is_avvailable;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}

	public String getLast_modification() {
		return last_modification;
	}

	public void setLast_modification(String last_modification) {
		this.last_modification = last_modification;
	}

		
}



