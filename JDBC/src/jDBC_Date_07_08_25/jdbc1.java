package jDBC_Date_07_08_25;
import java.sql.*;
public class jdbc1 {

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
	            rs = st.executeQuery("SELECT * FROM test1");

	            // Reading results
	            while (rs.next()) {
	                System.out.print(rs.getString(1)+":");
	                System.out.print(rs.getString(2)+":");
	                System.out.print(rs.getString(3)+":");
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
