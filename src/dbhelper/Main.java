package dbhelper;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
	static String url="jdbc:mysql://localhost:3306/sakila";
	static String username="root";
	static String password="12345";
	public static void main(String[] args) {
		DbHelper dbHelper=new DbHelper();
		
		Connection connection;
		
		try {
			connection=dbHelper.getConnection(url, username, password);
			System.out.println("Connected to database");
			
			
			
			connection.close();
			System.err.println("closed connection");
		} catch (SQLException e) {
			
			dbHelper.errorMessage(e);
		}
		
		
	}

}
