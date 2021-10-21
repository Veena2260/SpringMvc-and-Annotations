package org.impelsys.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.impelsys.dao.UserDao;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID=1L;
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		String username=request.getParameter("uname");
		String password=request.getParameter("pswd");
		UserDao ud=new UserDao();
		PrintWriter pw=response.getWriter();
		if(ud.validateUser(username,password))
		{
			RequestDispatcher dis=request.getRequestDispatcher("WelcomeServlet");
			dis.forward(request,response);
		}
		else
		{
			
			pw.println("<html><body>");
			pw.println("<h1> Wrong id AND/OR Password</h1></body></html>");
			RequestDispatcher dis=request.getRequestDispatcher("login.html");
		}
		}
}
