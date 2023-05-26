package com.LibraryManagementPortal.model;

import java.sql.ResultSet;

public interface DAOService {
	
	public void connectionDB();
	public void saveGeneralUserReg(String firstname,String lastname,String email,String password,String phone);
	public boolean verifyUserCredentials(String email, String Password);
	public boolean verifyAdminCredentials(String email, String Password);
	public void saveBookDetails(int bookid,String btitle,String bauthor,String bpublisher,String bedition,int bcopies);
	public ResultSet listAllBooks();
	public void deleteByTitle(String title);
	public void updateBook(int bookid,String btitle,String bauthor,String bpublisher,String bedition,int bcopies);
	public ResultSet searchBook(String btitle,String bauthor);
}
