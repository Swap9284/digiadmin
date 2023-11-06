package com.neosoft.digiadmin.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.digiadmin.dao.CustomerRepository;
import com.neosoft.digiadmin.entity.CustomerDetails;
import com.neosoft.digiadmin.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository custRepo;
	@Override
	public void saveCustomerDetails(CustomerDetails cust) {
		
		custRepo.save(cust);
		
		
	}
	@Override
	public CustomerDetails getCustomerByEmailAndMob(Long mobNo, String email) {
		
		return custRepo.getCustomerByEmailAndMobile(mobNo, email);
	}

}
