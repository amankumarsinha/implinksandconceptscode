package bankproj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class loginDao {
	
	public boolean check(String uname,String pass)throws Exception
	{
		String sql="select * from login where name=? and pass=?";
		String url="jdbc:mysql://localhost:3306/loginuser";
		String username="root";
		String password="root";
		try
		{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con=DriverManager.getConnection(url,username,password);
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pass);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				return true;
			}
		}
		catch(Exception e)
		{
			System.out.print("wrong");
			e.printStackTrace();
		}
		
		
		
		return false;
		
	}

}