package jdbcproj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class democlass {
	public static void main(String args[]) throws Exception
	{
	String url="jdbc:mysql://localhost:3306/loginuser";
	String uname="root";
	String pass="root";
	String sql="select * from login";
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn=DriverManager.getConnection(url,uname,pass);
	Statement st=conn.createStatement();
	ResultSet rs=st.executeQuery(sql);
	rs.next();
	String name=rs.getString("name");
	System.out.print(name);
	st.close();
	conn.close();
	
	}

}
