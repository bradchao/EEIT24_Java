package tw.brad.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBC01 {

	public static void main(String[] args) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("OK");
//		} catch (ClassNotFoundException e) {
//			System.out.println(e.toString());
//			System.exit(0);
//		}

//		String url = "jdbc:mysql://localhost:3306/iii" + 
//					"?user=root&password=root";
//		try {
//			Connection conn = DriverManager.getConnection(url);
//			System.out.println("OK2");
//		} catch (SQLException e) {
//			System.out.println(e);
//		}

//		String url = "jdbc:mysql://localhost:3306/iii";
//		try {
//			Connection conn = DriverManager.getConnection(url,"root","root");
//			System.out.println("OK3");
//		} catch (SQLException e) {
//			System.out.println(e);
//		}

		String url = "jdbc:mysql://localhost:3306/iii";
		try {
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			Connection conn = DriverManager.getConnection(url,prop);
			System.out.println("OK4");
			conn.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
	}

}
