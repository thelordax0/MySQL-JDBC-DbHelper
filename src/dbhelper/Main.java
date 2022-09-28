package dbhelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {
	static String url="jdbc:mysql://localhost:3306/sakila";
	static String username="root";
	static String password="12345";
	public static void main(String[] args) throws SQLException {
		DbHelper dbHelper=new DbHelper();
		
		Connection connection = null;
		Statement statement;
		ResultSet resultSet=null;
		
		try {
			connection=dbHelper.getConnection(url, username, password);
			System.out.println("Connected to database");
			
			statement=connection.createStatement();
			resultSet=statement.executeQuery("SELECT country_id,country from sakila.country;");
			
			
			ArrayList<Country> countries =new ArrayList<Country>();
			
			while(resultSet.next()) {
				countries.add(new Country(
						resultSet.getString("country_id"),
						resultSet.getString("country")));
			}
			
			for(Country country:countries) {
				System.out.println(country.getCountry()+" "+country.getCountryId());
			}
			
			
		} catch (SQLException e) {
			
			dbHelper.errorMessage(e);
		}finally {
			connection.close();
			System.err.println("closed connection");
		}
		
		
	}

}
