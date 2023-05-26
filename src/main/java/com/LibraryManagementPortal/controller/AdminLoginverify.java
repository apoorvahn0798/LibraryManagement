package com.LibraryManagementPortal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.LibraryManagementPortal.model.DAOService;
import com.LibraryManagementPortal.model.DAOServiceImpl;

@WebServlet("/verifyadminlogin")
public class AdminLoginverify extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AdminLoginverify() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		DAOService service = new DAOServiceImpl();
		service.connectionDB();
		boolean status = service.verifyAdminCredentials(email, password);
		
		if(status==true) {
			HttpSession session = request.getSession(true);
			session.setMaxInactiveInterval(10);
			session.setAttribute("email", email);
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Views/BookIndex.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("error", "Invalid Username/Password");
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Views/AdminLogin.jsp");
			rd.forward(request, response);
		}
	}catch(Exception e) {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Views/AdminLogin.jsp");
		rd.forward(request, response);
}
	}
}
