package com.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static String Driver="com.mysql.cj.jdbc.Driver";
	private static String Conn="jdbc:mysql://localhost:3306/Prapadhye";
	private static String unm="root";
	private static String pw="sanju";

	public static Connection getConn()
	{
	Connection con1=null;
	try {
		Class.forName(Driver);
		con1=DriverManager.getConnection(Conn,unm,pw);
	}catch(Exception tt)
	{System.out.println(tt);}
	return con1; 
	}
	}


