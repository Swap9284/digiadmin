package com.neosoft.digiadmin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "banktransaction")
public class BankTransactions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "accno")
	private Long accNo;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "transactiontype")
	private String transactionType;
	
	@Column(name = "transactionamount")
	private String tranactionAmount;

	public Long getAccNo() {
		return accNo;
	}

	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getTranactionAmount() {
		return tranactionAmount;
	}

	public void setTranactionAmount(String tranactionAmount) {
		this.tranactionAmount = tranactionAmount;
	}

	public BankTransactions(Long accNo, String name, String transactionType, String tranactionAmount) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.transactionType = transactionType;
		this.tranactionAmount = tranactionAmount;
	}

	public BankTransactions() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
