package com.neosoft.digiadmin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.neosoft.digiadmin.entity.CustomerDetails;
@Repository
public interface CustomerRepository extends JpaRepository<CustomerDetails, Long> {
	
	@Query("Select c from CustomerDetails c where mobileNo=:mobNo and email=:email")
	public CustomerDetails getCustomerByEmailAndMobile(@Param("mobNo") long mobNo,@Param("email") String email);

}
