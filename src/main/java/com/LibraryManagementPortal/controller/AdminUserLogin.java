package com.LibraryManagementPortal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/adminlogin")
public class AdminUserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdminUserLogin() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		HttpSession session = request.getSession(false);
		session.setMaxInactiveInterval(10);
		if(session.getAttribute("email")!=null) {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Views/AdminLogin.jsp");
		rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Views/AdminLogin.jsp");
			rd.forward(request, response);
	}
		}catch(Exception e) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Views/AdminLogin.jsp");
			rd.forward(request, response);
}
	}
}
