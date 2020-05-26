package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.LoginRepository;
import com.company.dto.LoginDTO;
import com.company.mapper.LoginConvertor;
import com.company.model.Login;

@Service
public class LoginService {

	@Autowired
	private LoginConvertor loginConvertor;
	
	@Autowired
	private LoginRepository loginRepository;
	
	
	
	public LoginDTO saveDetails(LoginDTO loginDTO)
	{
		Login login=loginConvertor.toLogin(loginDTO);
		Login login2=loginRepository.save(login);
		return loginConvertor.toLoginDTO(login2);
		
	}
}
