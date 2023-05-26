package com.LibraryManagementPortal.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.LibraryManagementPortal.model.DAOService;
import com.LibraryManagementPortal.model.DAOServiceImpl;

@WebServlet("/delete")
public class DeleteBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DeleteBookController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
				
		HttpSession session = request.getSession(false);
			session.invalidate();
			session.setMaxInactiveInterval(10);
			if(session.getAttribute("email")!=null) {
		String title = request.getParameter("title");
		DAOService service=new DAOServiceImpl();
		service.connectionDB();
		service.deleteByTitle(title);
		
		ResultSet result = service.listAllBooks();
		request.setAttribute("result", result);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Views/GetAllBooks.jsp");
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
