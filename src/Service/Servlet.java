package Service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet implements javax.servlet.Servlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	 public String Teacher(String uname,String email,String Phone,String teach) throws ClassNotFoundException, SQLException{
		 Bean sb=new Bean();
		 Dao a=new Dao();
		 sb.setName(uname);sb.setEmail(email);
		 sb.setName(Phone);sb.setTeach(teach);
		 String p=a.Teaching(sb);
		 if(p.equalsIgnoreCase("SUCCESS"))
			return "SUCCESS";
		 else
			 return "FAIL";
	    }
	 public String Learning(String uname,String email,String Phone,String learn) throws ClassNotFoundException, SQLException{
		 Bean sb=new Bean();
		 Dao a=new Dao();
		 sb.setName(uname);sb.setEmail(email);
		 sb.setName(Phone);sb.setTeach(learn);
		 String p=a.Teaching(sb);
		 if(p.equalsIgnoreCase("SUCCESS"))
			return "SUCCESS";
		 else
			 return "FAIL";
	    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String check1="",check2="";
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("uname");
		String email=request.getParameter("email");
		String phone=request.getParameter("Phone");
		String teach=request.getParameter("teach");
		String learn=request.getParameter("learn");
		Servlet st=new Servlet();
		try {
			 check1=st.Teacher(name, email, phone, teach);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			check2=st.Learning(name, email, phone, learn);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(check1.equals("SUCCESS") && check2.equals("SUCCESS"))
		response.sendRedirect("http://localhost:8080/JuspayProject/Map.html");
		else
			pw.println("Error Occur...! :-( \n try after a minute");
			
	}

}
