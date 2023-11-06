package com.neosoft.digiadmin.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.digiadmin.entity.RoleDetails;
import com.neosoft.digiadmin.serviceimpl.RoleDetailsServiceImpl;

@RestController
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	RoleDetailsServiceImpl roleDetailsServiceImpl;
	
	@PostMapping("/save-role")
	public ResponseEntity<Map<String,String>> saveRoleDetails(@RequestBody RoleDetails roleData){
		Map<String,String> responseMsg = new HashMap<>();
		roleDetailsServiceImpl.saveRoleData(roleData);
		responseMsg.put("message", "Role Details saved sucessfully");
		return ResponseEntity.ok(responseMsg);
		
	}


}
