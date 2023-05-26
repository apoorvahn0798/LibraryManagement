package com.LibraryManagementPortal.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOServiceImpl implements DAOService {
	private Connection con;
	private Statement stmnt;

	@Override
	public void connectionDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagement", "root", "test");
			stmnt=con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void saveGeneralUserReg(String firstname, String lastname, String email, String password, String phone) {
		try {
			stmnt.executeUpdate("insert into GeneralUser value('"+firstname+"','"+lastname+"','"+email+"','"+password+"','"+phone+"')");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return;
	}
	@Override
	public boolean verifyUserCredentials(String email, String Password) {
		try {
			ResultSet result = stmnt.executeQuery("select * from generaluser where email='"+email+"' and password='"+Password+"'");
			return result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean verifyAdminCredentials(String email, String Password) {
		try {
			ResultSet result = stmnt.executeQuery("select * from adminuser where email='"+email+"' and password='"+Password+"'");
			return result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public void saveBookDetails(int bookid, String btitle, String bauthor, String bpublisher, String bedition,
			int bcopies) {
		try {
			stmnt.executeUpdate("insert into Book value('"+bookid+"','"+btitle+"','"+bauthor+"','"+bpublisher+"','"+bedition+"','"+bcopies+"')");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public ResultSet listAllBooks() {
		try {
			ResultSet result = stmnt.executeQuery("select * from book");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public void deleteByTitle(String title) {
		try {
			stmnt.executeUpdate("delete from book where title='"+title+"'");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void updateBook(int bookid, String btitle, String bauthor, String bpublisher, String bedition, int bcopies) {
		try {
			stmnt.executeUpdate("update book SET title='"+btitle+"',author='"+bauthor+"',publisher='"+bpublisher+"',edition='"+bedition+"',copies='"+bcopies+"' where bookid='"+bookid+"'");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public ResultSet searchBook(String btitle, String bauthor) {
		try {
			ResultSet res = stmnt.executeQuery("select * from book where title='"+btitle+"', author='"+bauthor+"'");
			res.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

	

}
