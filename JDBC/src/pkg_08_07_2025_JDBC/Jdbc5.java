package pkg_08_07_2025_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc5 {

	public static void main(String[] args) {
	Connection con;
		Statement st;
		ResultSet rs;
		//

		try {
			// Establishing connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdpractise", "root", "Sudhanshu@942002");
			System.out.println("Connected to MySQL");
              
			// Creating statement and executing query
			st = con.createStatement();
			
			// Executing a query to retrieve data from the table
			rs = st.executeQuery("SELECT * FROM test1");
			
			
			java.sql.ResultSetMetaData rsmd = rs.getMetaData();
			
			System.out.println("Number of columns: " + rsmd.getColumnCount());
			System.out.println("Column names:"+rsmd.getColumnName(1) + ", " + rsmd.getColumnName(2) + ", " + rsmd.getColumnName(3));
			System.out.println("Column types: " + rsmd.getColumnTypeName(1) + ", " + rsmd.getColumnTypeName(2) + ", " + rsmd.getColumnTypeName(3));
			

			/*// Reading results
			while (rs.next()) {
				System.out.print(rs.getString(1) + ":");
				System.out.print(rs.getString(2) + ":");
				System.out.print(rs.getString(3));
				System.out.println("");
			}*/

			// Closing resources
			rs.close();
			st.close();
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
