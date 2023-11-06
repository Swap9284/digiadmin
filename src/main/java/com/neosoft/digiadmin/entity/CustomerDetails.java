package com.neosoft.digiadmin.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;


@Entity
@Table(name = "customer")
public class CustomerDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "custname")
	private String custName;
	
	@Column(name = "mobileno")
	private Long mobileNo;
	
	@Column(name = "dob")
	private Date dob;
	
	@Column(name = "pancard")
	private String panCard;
	
	@Column(name = "email")
	private String email;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "customer_offers",joinColumns  = {@JoinColumn(name = "custid")},inverseJoinColumns={@JoinColumn(name ="offerid")})
	private Set<OffersDetails> offers = new HashSet<>();


	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CustomerDetails(Long id, String custName, Long mobileNo, Date dob, String panCard, String email,
			Set<OffersDetails> offers) {
		super();
		this.id = id;
		this.custName = custName;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.panCard = panCard;
		this.email = email;
		this.offers = offers;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public Long getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getPanCard() {
		return panCard;
	}


	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Set<OffersDetails> getOffers() {
		return offers;
	}


	public void setOffers(Set<OffersDetails> offers) {
		this.offers = offers;
	}


		
	

}
