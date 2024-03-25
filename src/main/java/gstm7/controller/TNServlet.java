package gstm7.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TNServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("id"));
	String name=req.getParameter("name");
	String color=req.getParameter("color");
	
	ServletContext context=getServletContext();
	String cgst=context.getInitParameter("cgst");
	double cgst1=Double.parseDouble(cgst);
	
	ServletConfig config=getServletConfig();
	double sgstoftn=Double.parseDouble(config.getInitParameter("sgstoftn"));
	
	
	
	
	
	System.out.println("CGST is:::"+cgst1);
	System.out.println("SGST of TN is ::"+sgstoftn);
	
	
}
}
