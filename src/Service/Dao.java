package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao {
	public String Teaching(Bean Bean) throws ClassNotFoundException, SQLException{
		Connection con=DBUtil.getDBConnection();
		PreparedStatement st=con.prepareStatement("insert into TEACHING_TBL values(?,?,?,?,?)");
		st.setString(1,Bean.getName());
	      st.setString(2,Bean.getEmail());
	      st.setString(3,Bean.getNumber());
	      st.setString(4,Bean.getTeach());
	      int i=st.executeUpdate();
	      if(i>0)
	    	  return "SUCCESS";
	      else
		     return "FAIL";		
	}
	public String Learning(Bean Bean) throws ClassNotFoundException, SQLException{
		Connection con=DBUtil.getDBConnection();
		PreparedStatement st=con.prepareStatement("insert into LEARNING_TBL values(?,?,?,?,?)");
		st.setString(1,Bean.getName());
	      st.setString(2,Bean.getEmail());
	      st.setString(3,Bean.getNumber());
	      st.setString(4,Bean.getTeach());
	      int i=st.executeUpdate();
	      if(i>0)
	    	  return "SUCCESS";
	      else
		     return "FAIL";		
	}

}
