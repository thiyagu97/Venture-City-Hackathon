package Service;

import java.sql.*;
public class DBUtil {
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","B14105067","B14105067");
		return con;
	}

}
