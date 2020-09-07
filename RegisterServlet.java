package assignment2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<h1> Welcome to Form <h1>");
		
		// getting datas from html from
		String name = request.getParameter("user_name");
		String password = request.getParameter("user_password");
		String email = request.getParameter("user_email");
		String gender = request.getParameter("user_gender");
		String course = request.getParameter("user_course");
		
		String cond = request.getParameter("condition");
		
		if(cond.equals("checked"))
		{
			out.println("<h2> Name :" + name + "<h2>");
			out.println("<h2> Password :" + password + "<h2>");
			out.println("<h2> Email :" + email + "<h2>");
			out.println("<h2> Gender :" + gender + "<h2>");
			out.println("<h2> Course :" + course + "<h2>");
			
			
		}
		else
		{
			out.println("<h2> you have not accepted terms <h2>");
		}
		
//	String greet = getServletContext().getInitParameter("greet");
//	out.print(greet);
		
		
	}
	
	
	

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<h1> Welcome to Form <h1>");
		
		// getting datas from html from
		String name = request.getParameter("user_name");
		String password = request.getParameter("user_password");
		String email = request.getParameter("user_email");
		String gender = request.getParameter("user_gender");
		String course = request.getParameter("user_course");
		
		String cond = request.getParameter("condition");
		
		if(cond.equals("checked"))
		{
			out.println("<h2> Name :" + name + "<h2>");
			out.println("<h2> Password :" + password + "<h2>");
			out.println("<h2> Email :" + email + "<h2>");
			out.println("<h2> Gender :" + gender + "<h2>");
			out.println("<h2> Course :" + course + "<h2>");
			
			
		}
		else
		{
			out.println("<h2> you have not accepted terms <h2>");
		}
		
		/* servlet context implementation
		 * 
		 */
		
		
		String greet = getServletContext().getInitParameter("greet");
		out.print(greet);
		
		/* 
		 * servlet config implementation
		 * 
		 */
		
		String tech = getServletConfig().getInitParameter("thanks");
		out.println(tech);
		
		
	}
	
}
