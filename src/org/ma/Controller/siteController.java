package org.ma.Controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.ma.entity.User;
import org.ma.model.userModel;

/**
 * Servlet implementation class siteController
 */
@WebServlet("/siteController")
public class siteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name="jdbc/project")
	private DataSource datasource;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String action= request.getParameter("action");
	switch (action) {
	case "userregistration":
		userRegistration(request,response);
		break;

	default:
		break;
	}
	}

	private void userRegistration(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User newuser= new User(request.getParameter("fristname"), request.getParameter("lastname"), request.getParameter("email"), request.getParameter("username"), request.getParameter("password"));
		addnewUser(newuser);
		request.setAttribute("reg", "registration sucerss");
		request.getRequestDispatcher("/login.jsp").forward(request, response);
		
	}

	private void addnewUser(User newuser) {
		new userModel().addNewuser(datasource,newuser);
   		return;
	}

	


	

}
