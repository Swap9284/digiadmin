package com.neosoft.digiadmin.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.digiadmin.entity.SubMenuDetails;
import com.neosoft.digiadmin.serviceimpl.SubMenuServiceImpl;

@RestController
@RequestMapping("/submenu")
public class SubMenuController {
	
	@Autowired
	SubMenuServiceImpl subMenuServiceImpl;
	
	@PostMapping("/save-submenu")
	public ResponseEntity<Map<String,String>> saveSubMenuDetails(@RequestBody SubMenuDetails subMenuData){
		Map<String,String> responseMsg = new HashMap<>();
		subMenuServiceImpl.saveSubMenuData(subMenuData);
		responseMsg.put("message", "SubMenu Details Saved Successfully");
		return ResponseEntity.ok(responseMsg);
		
	}

}
