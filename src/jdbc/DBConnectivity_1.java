package jdbc;

import java.sql.*;

public class DBConnectivity_1 {

    //Credentials
    private static final String url = "jdbc:mysql://localhost:3306/jdbc_demo";
    private static final String username = "root";
    private static final  String password = "root";
    private static final String driverName= "com.mysql.cj.jdbc.Driver";

    public static void main(String[] args) throws ClassNotFoundException {
        // 1. Load the driver (not required since JDBC 4.0 with auto-loading)
        Class.forName(driverName);
        try(
            // 2. Establish connection
            Connection conn = DriverManager.getConnection(url, username, password);

            // 3. Create statement
            Statement stmt = conn.createStatement();

            // 4. Execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");){
            // 5. Process results
            while(rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
