package com.Registerservlet.in;

import java.awt.Checkbox;
import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.RegDao.in.RegisterationDao;
import com.registermodel.org.Login;
import com.registermodel.org.RegistrationDetails;

@WebServlet("/")
public class RegisterDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterDetailsServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();
		switch (path) {
		case "/Insert":
			insertLogin(request, response);
			break;
		case "/Validate":
			validateLogin(request, response);
			break;
		case "/RegisterData":
			registerData(request, response);
			break;
		default:
			getLoginPage(request, response);
			break;
		}

	}

	private void validateLogin(HttpServletRequest request, HttpServletResponse response) {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		Login lm = new Login(email, password);
		RegisterationDao rd = new RegisterationDao();
		String check = rd.checkLogin(lm);
		if (check.equals("Success")) {
			RequestDispatcher grd = request.getRequestDispatcher("Controller.jsp");
			try {
				grd.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			RequestDispatcher grd = request.getRequestDispatcher("Login.jsp");
			try {
				grd.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void insertLogin(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		long mobile = Long.parseLong(request.getParameter("mobile"));
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		RegistrationDetails r = new RegistrationDetails(name, email, password, mobile, gender, city);
		RegisterationDao rd = new RegisterationDao();
		rd.insertRegisteration_Details(r);
		RequestDispatcher grd = request.getRequestDispatcher("Home.jsp");
		try {
			grd.forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void registerData(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void getLoginPage(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
