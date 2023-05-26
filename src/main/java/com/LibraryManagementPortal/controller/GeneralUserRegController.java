package com.LibraryManagementPortal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.LibraryManagementPortal.model.DAOService;
import com.LibraryManagementPortal.model.DAOServiceImpl;

@WebServlet("/savereg")
public class GeneralUserRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public GeneralUserRegController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		
		DAOService service = new DAOServiceImpl();
		service.connectionDB();
		service.saveGeneralUserReg(firstname, lastname, email, password, phone);
		
		request.setAttribute("msg", "Record is Saved!!!!");
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Views/GeneralUserLogin.jsp");
		rd.forward(request, response);
	}

}
