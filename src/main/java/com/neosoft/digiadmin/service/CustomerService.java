package com.neosoft.digiadmin.service;

import com.neosoft.digiadmin.entity.CustomerDetails;

public interface CustomerService {
    public void saveCustomerDetails(CustomerDetails cust);
    public CustomerDetails getCustomerByEmailAndMob(Long mobNo,String email);
    	
    
}
