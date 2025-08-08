package pkg_08_07_2025_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc4 {

	public static void main(String[] args) {
		 Connection con;
	        Statement st;
	       
		
		try {
            // Establishing connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdpractise", "root", "Sudhanshu@942002");
            System.out.println("Connected to MySQL");
            
            
            // Creating statement and executing query
            st = con.createStatement();
            st.addBatch("INSERT INTO test1 VALUES (1, 'John', 100)");
            st.addBatch("INSERT INTO test1 VALUES (2, 'Jane', 50)");
            st.executeBatch();
            con.close();
            
            
		}
		catch (Exception e) {
			System.out.println("Connection failed: " + e.getMessage());
		}
	}

}
