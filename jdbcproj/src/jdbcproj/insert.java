package jdbcproj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class insert {
	public static void main(String args[]) throws Exception
	{
	String url="jdbc:mysql://localhost:3306/loginuser";
	String uname="root";
	String pass="root";
	String sql="insert into login values('ankit','palalhania')";
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn=DriverManager.getConnection(url,uname,pass);
	Statement st=conn.createStatement();
	int rows=st.executeUpdate(sql);
	System.out.print(rows);
 st.close();
	conn.close();
	
	}

}