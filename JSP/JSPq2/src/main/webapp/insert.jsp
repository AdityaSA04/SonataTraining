<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*,java.util.*" %>
<%
String name = request.getParameter("name");
String address = request.getParameter("address");
String num = (request.getParameter("num"));
try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "Aditya@1az");
		Statement st = con.createStatement();
		int i = st.executeUpdate("insert into customerdetails(name,address,num)values('"+name+"','"+address+"','"+num+"')");
		out.println("Successfully inserted");
		}
		catch(Exception e)
		{
		out.println(e);
		}
%>