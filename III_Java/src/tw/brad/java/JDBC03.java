package tw.brad.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBC03 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/iii";
		try {
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			Connection conn = DriverManager.getConnection(url,prop);
			
			Statement stmt = conn.createStatement();
			int n = stmt.executeUpdate(
				"DELETE FROM cust");
			System.out.println(n);
			
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
