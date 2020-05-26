package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.dto.LoginDTO;
import com.company.model.Login;
import com.company.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@PostMapping("/login")
	public LoginDTO saveData(@RequestBody LoginDTO loginDTO)
	{
		return loginService.saveDetails(loginDTO);
	}
}