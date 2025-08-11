package com.sudhanshutechx.MymavenJDBC1;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.json.JSONArray;
import org.json.JSONObject; 

public class JDBCjsonmaking {

    // Method to convert ResultSet into JSON
    public static JSONArray convertToJSON(ResultSet rs) throws SQLException  {
        JSONArray jsonArray = new JSONArray();
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

        while (rs.next()) {
            JSONObject jsonObject = new JSONObject();
            for (int i = 1; i <= columnCount; i++) {
                String columnName = rsmd.getColumnName(i);
                Object columnValue = rs.getObject(i);
                jsonObject.put(columnName, columnValue);
            }
            jsonArray.put(jsonObject);
        }
        return jsonArray;
    }

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdpractise", "root", "Sudhanshu@942002")) {

            System.out.println("Connected to MySQL");

            // Print database metadata
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

            // Example query to fetch table data
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM test1"); // Adjust the query as needed

            // Convert to JSON and print
            JSONArray jsonData = convertToJSON(rs);
            System.out.println("Data in JSON format:\n" + jsonData.toString(2));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
