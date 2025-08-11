package pkg_09_08_2025_JDBC;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;




public class Switchingdatabases {

	
		public static void main(String[] args) {
			
			Connection con;
				
				//

				try {
					// Establishing connection
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdpractise", "root", "Sudhanshu@942002");
					System.out.println("Connected to MySQL");
					
					
		              
					// Retrieving database metadata
					DatabaseMetaData dbmd = con.getMetaData();
					System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
					System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());
					System.out.println("Database User Name: " + dbmd.getUserName());
					System.out.println("Database URL: " + dbmd.getURL());
					System.out.println("Driver Name: " + dbmd.getDriverName());
					System.out.println("Driver Version: " + dbmd.getDriverVersion());
					System.out.println("Major Version: " + dbmd.getDatabaseMajorVersion());
					System.out.println("Minor Version: " + dbmd.getDatabaseMinorVersion());
					System.out.println("Max Connections: " + dbmd.getMaxConnections());
					System.out.println("Max Tables in Select: " + dbmd.getMaxTablesInSelect());
					System.out.println("Max Columns in Select: " + dbmd.getMaxColumnsInSelect());
					
					

					con.close();

				} catch (Exception e) {
					System.out.println(e);
				}

			}

		}