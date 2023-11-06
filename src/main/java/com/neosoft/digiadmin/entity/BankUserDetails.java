package com.neosoft.digiadmin.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "bankuser")
public class BankUserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "username")
	private String userName;

	@Column(name = "password")
	private String password;

	@Column(name = "emailid")
	private String emailId;

	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "roleid",referencedColumnName="id") //foreign key (roleid) references role (id)
	private RoleDetails role;


	public BankUserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BankUserDetails(long id, String userName, String password, String emailId, RoleDetails role) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.emailId = emailId;
		this.role = role;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public RoleDetails getRole() {
		return role;
	}


	public void setRole(RoleDetails role) {
		this.role = role;
	}


}
