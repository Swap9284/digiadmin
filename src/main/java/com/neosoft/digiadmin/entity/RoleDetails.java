package com.neosoft.digiadmin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "role")
public class RoleDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@Column(name = "rolename",length = 100,nullable = false)
	private String roleName;
	
	@OneToOne(mappedBy = "role") 
    private BankUserDetails bankuser;

	public RoleDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoleDetails(long id, String roleName, BankUserDetails bankuser) {
		super();
		this.id = id;
		this.roleName = roleName;
		this.bankuser = bankuser;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public BankUserDetails getBankuser() {
		return bankuser;
	}

	public void setBankuser(BankUserDetails bankuser) {
		this.bankuser = bankuser;
	}

     
	


	
	

}
