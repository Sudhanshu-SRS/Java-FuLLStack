package pkg_14_08_2025_optionalAndNullableinJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Optional;

public class OptionalAndNullable_JDBC {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Establish a connection to the database
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdpractise",
                "root",
                "Sudhanshu@942002"
            );
            System.out.println("Connected to MySQL");

            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM test1 WHERE id = 1");

            while (rs.next()) {
                Optional<String> name = Optional.ofNullable(rs.getString("name"));
                Optional<String> phone = Optional.ofNullable(rs.getString("phone"));

                if (name.isPresent()) {
                    System.out.println("Name: " + name.get());
                } else {
                    System.out.println("Name is null");
                }

                if (phone.isPresent()) {
                    System.out.println("Phone: " + phone.get());
                } else {
                    System.out.println("Phone is null");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception ignored) {}
            try { if (stmt != null) stmt.close(); } catch (Exception ignored) {}
            try { if (con != null) con.close(); } catch (Exception ignored) {}
        }
    }
}
// This code demonstrates how to use Optional and Nullable in JDBC to handle potential null values