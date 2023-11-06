package com.neosoft.digiadmin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.digiadmin.entity.BankUserDetails;

public interface BankRepository extends JpaRepository<BankUserDetails, Long>{
	

}
