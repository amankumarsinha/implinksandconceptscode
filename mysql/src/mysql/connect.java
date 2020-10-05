package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class connect {
	public static void main(String args[]) throws Exception
	{
	String url="jdbc:mysql://localhost:3306/loginuser";
	String uname="root";
	String pass="root";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn=DriverManager.getConnection(url,uname,pass);
	if(conn!=null)
	System.out.print("connect");
	conn.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	}

}