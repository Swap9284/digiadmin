package com.neosoft.digiadmin.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.digiadmin.dao.BankRepository;
import com.neosoft.digiadmin.entity.BankUserDetails;
import com.neosoft.digiadmin.service.BankUserDetailsService;

@Service
public class BankUserDetailsServiceImpl implements BankUserDetailsService{

	@Autowired
	BankRepository bankRepo;
	@Override
	public void saveBankData(BankUserDetails bankData) {
		if(!bankData.getUserName().isEmpty() && bankData.getUserName()!=null) {
		   bankRepo.save(bankData);
		} else {  
			throw new NullPointerException("Bank-Details are null");
		}
		
		
		
	}
	

}
