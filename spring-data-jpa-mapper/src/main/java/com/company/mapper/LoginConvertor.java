package com.company.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.company.dto.LoginDTO;
import com.company.model.*;

@Component
public class LoginConvertor {

	@Autowired
	private ModelMapper modelMapper;
	
	public LoginDTO toLoginDTO(Login login)
	{
		LoginDTO loginDTO=modelMapper.map(login, LoginDTO.class);
		
		return loginDTO;
		
	}
	
	public Login toLogin(LoginDTO loginDTO)
	{
		Login login=modelMapper.map(loginDTO, Login.class);
		return login;
	}
}
