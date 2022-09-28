package dbhelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
	
	
	
	
	
	
	public Connection getConnection(String url,String username,String password) throws SQLException {
		
		return DriverManager.getConnection(url, username, password);
	}
	
	
	
	
	public void errorMessage(Exception ex) {
		System.out.println("Error: "+ex.getMessage());
	}
}
