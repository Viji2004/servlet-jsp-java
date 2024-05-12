package com.Viji;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//using annotations
@WebServlet("/add")

public class AddServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		//PrintWriter out=res.getWriter();
		//out.println("The result is: "+ k);
//______________________________________________________________________________________
		
	/*
		//passing attribute from one servlet to another
		req.setAttribute("k",k);
		//request dispatcher to refer one servlet from another servlet
		RequestDispatcher rd=req.getRequestDispatcher("sq");
		rd.forward(req,res);
	*/	
//_______________________________________________________________________________________
		
		//for redirect method
		//res.sendRedirect("sq?k="+k);//url rewriting
//_______________________________________________________________________________________
	/*
		
		//by using session maintainanace
		HttpSession session=req.getSession();
	session.setAttribute("k",k);
		res.sendRedirect("sq");
		*/
//________________________________________________________________________________________

		//by using cookie
		 Cookie cookie=new Cookie("k",k+"");
		 res.addCookie(cookie);
		 res.sendRedirect("sq");
		 
	} 

}
