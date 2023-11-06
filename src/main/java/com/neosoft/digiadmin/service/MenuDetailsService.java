package com.neosoft.digiadmin.service;

import java.util.List;


import com.neosoft.digiadmin.entity.MenuDetails;

public interface MenuDetailsService {
	
	public void saveMenuData(MenuDetails menuData);

	public void updateMenuData(MenuDetails menuData);
	
	public  List<MenuDetails> getAllMenuDetails( );
	
	public MenuDetails getMenuDataById(Long id);
	
	List<MenuDetails> getActiveMenuDetails(int status);

}
