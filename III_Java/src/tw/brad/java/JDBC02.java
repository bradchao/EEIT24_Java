package tw.brad.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBC02 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://10.0.103.94:3306/iii";
		try {
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "123456");
			Connection conn = DriverManager.getConnection(url,prop);
			
			Statement stmt = conn.createStatement();
			int n = stmt.executeUpdate(
				"INSERT INTO cust (cname,birthday,tel) VALUES " + 
					"('Brad','1999-01-02','123')," +
					"('Tony','1999-01-02','123')," +
					"('Peter','1999-01-02','123')"
						);
			System.out.println(n);
			
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
