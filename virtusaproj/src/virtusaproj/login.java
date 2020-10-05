package virtusaproj;



import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpCookie;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import bankproj.loginDao;

import java.sql.*;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialversionUId=1L;
	
	public login()
	{
		super();
	}
	
    protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
    {
        
            String pass=req.getParameter("pass");
            
            String uname=req.getParameter("uname");
            loginDao dao=new loginDao();
            try {
				if(dao.check(uname, pass))
				{
					HttpSession session=req.getSession();
					session.setAttribute("username", uname);
					res.sendRedirect("welcome.jsp");
  
              }
				else
				{ 
					System.out.print("wrong");
					res.sendRedirect("login.jsp");
				}
		
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    }
}
