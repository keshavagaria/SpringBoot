package com.mobile;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DemoServlet
 */
public class DemoServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empId=request.getParameter("employeeId");
		int id=Integer.parseInt(empId);
		String empName=request.getParameter("employeeName");
		String empAddress=request.getParameter("employeeAddress");
		
		
		HttpSession session=request.getSession(true);
		EmployeeDAO employeeDAO=new EmployeeDAO();
		employeeDAO.addDetails(id, empName, empAddress);
		response.sendRedirect("Success");
		
	}

}
