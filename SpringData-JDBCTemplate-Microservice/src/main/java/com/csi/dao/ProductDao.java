package com.csi.dao;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.csi.model.ProductDetails;

@Repository
public class ProductDao {

	@Autowired
	JdbcTemplate template;
	public List<ProductDetails> getDetails() throws ParseException
	{
		String sql="select * from ProductDetails";
		List<ProductDetails> list=new ArrayList();
		List<Map<String,Object>>rows=template.queryForList(sql);
		
		for(Map<String,Object> row:rows)
		{
				
		   ProductDetails pd=new ProductDetails();
		     pd.setProductId((int)row.get("productId"));
			  pd.setProductName((String)row.get("productName"));
			  pd.setProductPrice((double)row.get("productPrice")); 
			  //String s=row.get("productLaunchDate").toString();
			  //SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-YYYY");
			  //Date d=sdf.parse(s);
			 //String s2= sdf.format(d);
			  pd.setProductLaunchDate((Date)row.get("productLaunchDate"));
			  String s3=row.get("productTechnicalSupportNumber").toString();
			  pd.setProductTechnicalSupportNumber(Long.parseLong(s3));

			  
			  list.add(pd);
				 
			
		}
		return list;
	}
	
	public int createProduct(ProductDetails pd){  
	    String query="insert into ProductDetails values('"+pd.getProductId()+"','"+pd.getProductName()+"', '"+pd.getProductPrice()+"','"+pd.getProductLaunchDate()+"','"+pd.getProductTechnicalSupportNumber()+"')";  
	    return template.update(query);  
	}  


	public int updateProduct(ProductDetails pd){  
	    String query="update ProductDetails set productName='"+pd.getProductName()+"', productPrice='"+pd.getProductPrice()+"',productLaunchDate='"+pd.getProductLaunchDate()+"', productTechnicalSupportNumber='"+pd.getProductTechnicalSupportNumber()+"' where productId='"+pd.getProductId()+"'";
	    return template.update(query);  
	}  


	public int deleteProduct(ProductDetails pd){  
	    String query="delete from ProductDetails where productId='"+pd.getProductId()+"' ";  
	    return template.update(query);  
	} 
}
