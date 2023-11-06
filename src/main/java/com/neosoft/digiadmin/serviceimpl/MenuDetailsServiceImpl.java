package com.neosoft.digiadmin.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.digiadmin.dao.MenuRepository;
import com.neosoft.digiadmin.entity.MenuDetails;
import com.neosoft.digiadmin.service.MenuDetailsService;

import jakarta.persistence.NoResultException;

@Service
public class MenuDetailsServiceImpl  implements MenuDetailsService{
    @Autowired
    MenuRepository menuRepo;
    
	@Override
	public void saveMenuData(MenuDetails menuData) {
		if(!menuData.getMenuName().isEmpty() && menuData.getMenuName()!=null) {
			menuRepo.save(menuData);
		}else {
			throw new NullPointerException("Menu-Details are null");
		}
		
		
	}

	@Override
	public void updateMenuData(MenuDetails menuData) {
		menuRepo.save(menuData);
		
	}

	@Override
	public List<MenuDetails> getAllMenuDetails() {
		List<MenuDetails> menuDetailsList = menuRepo.findAll();
		if(menuDetailsList!=null && !menuDetailsList.isEmpty()){
			return menuDetailsList;
		}else {
			throw new NoResultException("No records present in menu");
		}
	}

	@Override
	public MenuDetails getMenuDataById(Long id) {
		Optional<MenuDetails> menuData = menuRepo.findById(id);
		if(menuData.isPresent()) {
			return menuData.get();
		}else {
			throw new NullPointerException("No records found");
		}
		
		
	}

	@Override
	public List<MenuDetails> getActiveMenuDetails(int status) {
		Optional<List<MenuDetails>> menuData=menuRepo.getMenuDataByStatus(status);
		if(menuData.isPresent()) {
			return menuData.get();
		}else {
			throw new NullPointerException("no records found");
		}
	}
	
	

}
