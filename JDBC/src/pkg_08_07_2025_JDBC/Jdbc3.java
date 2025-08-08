package pkg_08_07_2025_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc3 {


	 public static void main(String[] ar) {
	        Connection con;
	        Statement st;
	        ResultSet rs;

	        try {
	            // Establishing connection
	            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdpractise", "root", "Sudhanshu@942002");
	            System.out.println("Connected to MySQL");

	            // Creating statement and executing query
	            st = con.createStatement();
	            
	           // Inserting a record into the table vai SQL command using executeUpdate
	            int i = st.executeUpdate("INSERT INTO test1 VALUES (5, 'Sudhanshi', '942002')");
	            System.out.println(i + " record(s) inserted successfully.");
	            
	            
	           
	            //Removing a record from the table
	            
	             /*   int i = st.executeUpdate("DELETE FROM test1 WHERE id = 4");	
	             System.out.println(i + " record(s) deleted successfully.");
	             */
	            
	            
	            
	            
	            // Executing a query to retrieve data from the table
	            rs = st.executeQuery("SELECT * FROM test1");

	            // Reading results
	            while (rs.next()) {
	                System.out.print(rs.getString(1)+":");
	                System.out.print(rs.getString(2)+":");
	                System.out.print(rs.getString(3));
	                System.out.println("");
	            }

	            // Closing resources
	            rs.close();
	            st.close();
	            con.close();


	        } catch (Exception e) {
	            System.out.println(e);
	        }

	 }
	 
}
// This code connects to a MySQL database, creates a statement, and inserts a record into the "test1" table.
// It uses the JDBC API to handle database operations and prints the number of records inserted.
// Make sure to have the MySQL JDBC driver in your classpath to run this code successfully.
