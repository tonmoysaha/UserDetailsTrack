package org.ma.Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.ma.entity.User;
import org.ma.model.userModel;

/**
 * Servlet implementation class userController
 */
@WebServlet("/userController")
public class userController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name = "jdbc/project")
	private DataSource datasource;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = request.getParameter("page");
		page = page.toLowerCase();
		switch (page) {
		case "logout":
			request.getSession().invalidate();
			request.getRequestDispatcher("login.jsp").forward(request, response);
			break;
		case "userlist":
			Userlist(request, response);
			break;
		case "updateuserform":
			updateUserForm(request, response);
			break;
		case "deleteuser":
			
			new userModel().deleteUser(Integer.parseInt(request.getParameter("userId")),datasource);
			Userlist(request, response);
			break;

		default:
			Eror(request, response);
			break;
		}
	}

	private void updateUserForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int userId = Integer.parseInt(request.getParameter("userId"));
		User theUser = new userModel().getUser(userId, datasource);
		request.setAttribute("theUser", theUser);
		request.setAttribute("title", "updateuser");
		request.getRequestDispatcher("/updateuserform.jsp").forward(request, response);

	}

	private void Userlist(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<User> userlist = new ArrayList<>();
		userlist = new userModel().Userlist(datasource);
		request.setAttribute("userlist", userlist);
		request.setAttribute("title", "User List");
		request.getRequestDispatcher("/userlist.jsp").forward(request, response);

	}

	private void Eror(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("title", "ERROR");
		request.getRequestDispatcher("/error.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String opration = request.getParameter("operation");

		switch (opration) {
		case "updateUser":
			int userId = Integer.parseInt(request.getParameter("userId"));
			String fristname = request.getParameter("fristname");
			String lastname = request.getParameter("lastname");
			String email = request.getParameter("email");
			String username = request.getParameter("username");

			System.out.println(userId + fristname + lastname);

			User theuser = new User(userId, fristname, lastname, email, username);
			new userModel().updateUser(theuser, datasource);
			Userlist(request, response);

			break;

		default:
			break;
		}

	}

}
