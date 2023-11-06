package com.neosoft.digiadmin.controller;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.digiadmin.entity.MenuDetails;
import com.neosoft.digiadmin.serviceimpl.MenuDetailsServiceImpl;



@RestController
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired
	MenuDetailsServiceImpl menuDetailsServiceImpl;
	
	@PostMapping("/save-menu")
	public ResponseEntity<Map<String,String>> saveMenuDetails(@RequestBody MenuDetails menuData) {
		Map<String,String> responseMsg = new HashMap<>();
		menuDetailsServiceImpl.saveMenuData(menuData);
		responseMsg.put("message", "Menu Details Saved Successfully");
		return ResponseEntity.ok(responseMsg);
	}
	@PutMapping("/update-menu")
	public ResponseEntity<Map<String,String>> updateMenuDetails(@RequestBody MenuDetails menuData) { 
		Map<String,String> responseMsg = new HashMap<>();
		menuDetailsServiceImpl.updateMenuData(menuData);
		responseMsg.put("message", "Menu Details updated Successfully");
		return ResponseEntity.ok(responseMsg);
	}
	
	@GetMapping("/menu-details")
	public ResponseEntity<List<MenuDetails>> getAllMenuDetails( ){
		List<MenuDetails> menuList = menuDetailsServiceImpl.getAllMenuDetails();
		return new ResponseEntity<>(menuList,HttpStatus.OK);
	}
	
	@GetMapping("/menu-details/{id}")
	public ResponseEntity<MenuDetails> getMenuDetailsById(@PathVariable  Long id){
		MenuDetails menuData = menuDetailsServiceImpl.getMenuDataById(id);
		return new ResponseEntity<>(menuData,HttpStatus.OK);
		
	}
	
	@GetMapping("/menu-by-status")
	public ResponseEntity<List<MenuDetails>> getActiveMenuDetails(@RequestParam int status){
		List<MenuDetails> menuList=menuDetailsServiceImpl.getActiveMenuDetails(status);
		return new ResponseEntity<>(menuList,HttpStatus.OK);
		
	}
}
