package com.csi.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csi.dao.ProductDao;

import com.csi.model.ProductDetails;


@RestController
@RequestMapping("/api")
public class AppController {
	@Autowired
	ProductDao productdao;
	
	@GetMapping("/getInfo")
	public List<ProductDetails> getInfo() throws ParseException{
		List<ProductDetails> list=productdao.getDetails();
		return list;
	}
	
	@PostMapping("/createInfo")
	public ProductDetails createInfo(@RequestBody ProductDetails pd)
	{
		//Employee emp=new Employee();
		int result=productdao.createProduct(pd);
		System.out.println(result);
		return pd;
	}
	
	
	@PutMapping("/updateInfo")
	public ProductDetails updateInfo(@RequestBody ProductDetails pd)
	{
		//Employee emp=new Employee();
		int result=productdao.updateProduct(pd);
		System.out.println(result);
		return pd;
	}
	
	@DeleteMapping("/deleteInfo")
	public ProductDetails deleteInfo(@RequestBody ProductDetails pd)
	{
		//Employee emp=new Employee();
		int result=productdao.deleteProduct(pd);
		System.out.println(result);
		return pd;
	}
}
