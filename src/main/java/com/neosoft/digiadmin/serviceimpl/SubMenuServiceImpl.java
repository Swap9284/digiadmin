package com.neosoft.digiadmin.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.digiadmin.dao.SubMenuRepository;
import com.neosoft.digiadmin.entity.SubMenuDetails;
import com.neosoft.digiadmin.service.SubMenuDetailsService;

@Service
public class SubMenuServiceImpl implements SubMenuDetailsService {
	
	@Autowired
	SubMenuRepository subRepo;
	

	@Override
	public void saveSubMenuData(SubMenuDetails subMenuData) {
		if(!subMenuData.getSubMenuName().isEmpty() && subMenuData.getSubMenuName()!=null) {
			subRepo.save(subMenuData);
		}else {
			throw new NullPointerException("SubMenu Details are null");
				
		}
			
		
          		
	}

}
