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

@WebServlet("/update")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public UpdateController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			HttpSession session = request.getSession(false);
			session.setMaxInactiveInterval(10);
			if(session.getAttribute("email")!=null) {
		int bookid = Integer.parseInt(request.getParameter("bookid"));
		String btitle = request.getParameter("btitle");
		String bauthor = request.getParameter("bauthor");
		String bpublisher = request.getParameter("bpublisher");
		String bedition = request.getParameter("bedition");
		int bcopies = Integer.parseInt(request.getParameter("bcopies"));
		
		request.setAttribute("bookid", bookid);
		request.setAttribute("btitle", btitle);
		request.setAttribute("bauthor", bauthor);
		request.setAttribute("bpublisher", bpublisher);
		request.setAttribute("bedition", bedition);
		request.setAttribute("bcopies", bcopies);
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Views/UpdateBook.jsp");
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
		try {
			HttpSession session = request.getSession(false);
			session.setMaxInactiveInterval(10);
			if(session.getAttribute("email")!=null) {
		int bookid = Integer.parseInt(request.getParameter("bookid"));
		String btitle = request.getParameter("btitle");
		String bauthor = request.getParameter("bauthor");
		String bpublisher = request.getParameter("bpublisher");
		String bedition = request.getParameter("bedition");
		int bcopies = Integer.parseInt(request.getParameter("bcopies"));
		
		DAOService service= new DAOServiceImpl();
		service.connectionDB();
		service.updateBook(bookid, btitle, bauthor, bpublisher, bedition, bcopies);
		
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

}
