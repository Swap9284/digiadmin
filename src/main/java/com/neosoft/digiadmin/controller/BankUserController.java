package com.neosoft.digiadmin.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.digiadmin.entity.BankUserDetails;
import com.neosoft.digiadmin.serviceimpl.BankUserDetailsServiceImpl;

@RestController
@RequestMapping("/bank")
public class BankUserController {
	
	@Autowired
	BankUserDetailsServiceImpl bankUserDetailsServiceImpl;
	
	@PostMapping("/save-bank")
	public ResponseEntity<Map<String,String>> saveBankUserDetails(@RequestBody BankUserDetails bankData){
		Map<String,String> responseMsg = new HashMap<>();
		bankUserDetailsServiceImpl.saveBankData(bankData);
		responseMsg.put("message", "BankUser Details are saved successfully ");
		return ResponseEntity.ok(responseMsg);
	}

}
