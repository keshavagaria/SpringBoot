package com.csi.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	private MyUserDetailsService service;
	@RequestMapping("/get")
	public String getInfo()
	{
		return "home.jsp";
	}
}
