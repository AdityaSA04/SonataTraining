package com.sonata;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String uname = request.getParameter("uname");
		String pword = request.getParameter("pword");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "Aditya@1az");
			PreparedStatement ps = con.prepareStatement("select * from credentials where username=? and password=?");
			ps.setString(1,uname);
			ps.setString(2,pword);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				out.println("login successful");
				RequestDispatcher rd = request.getRequestDispatcher("Product.html");
				rd.forward(request,response);
			}else {
				out.println("invalid login");
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);	
			}
		}catch (Exception e) {
			e.printStackTrace();		
			}
	}

}
