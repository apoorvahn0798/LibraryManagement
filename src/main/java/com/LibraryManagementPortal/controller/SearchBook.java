package com.LibraryManagementPortal.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.LibraryManagementPortal.model.DAOService;
import com.LibraryManagementPortal.model.DAOServiceImpl;

@WebServlet("/searchbook")
public class SearchBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SearchBook() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String btitle = request.getParameter("btitle");
			String bauthor = request.getParameter("bauthor");
			
			DAOService service = new DAOServiceImpl();
			service.connectionDB();
			ResultSet res = service.searchBook(btitle, bauthor);
			
			
	}

}
