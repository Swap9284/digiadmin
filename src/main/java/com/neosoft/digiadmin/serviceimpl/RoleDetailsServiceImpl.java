package com.neosoft.digiadmin.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.digiadmin.dao.RoleRepository;
import com.neosoft.digiadmin.entity.RoleDetails;
import com.neosoft.digiadmin.service.RoleDetailsService;

@Service
public class RoleDetailsServiceImpl implements RoleDetailsService {

	@Autowired
	RoleRepository roleRepo;
	@Override
	public void saveRoleData(RoleDetails roleData) {
		if( !roleData.getRoleName().isEmpty() && roleData.getRoleName()!=null) {
			roleRepo.save(roleData);
		}else {
			throw new NullPointerException("Role-Details are null");
		}
		
		
	}

}
