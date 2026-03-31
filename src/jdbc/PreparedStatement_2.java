package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatement_2 {
    //Credentials
    private static final String url = "jdbc:mysql://localhost:3306/jdbc_demo";
    private static final String username = "root";
    private static final  String password = "root";
    private static final String driverName= "com.mysql.cj.jdbc.Driver";
    private static final String query= "INSERT INTO EMPLOYEE (id, name) VALUES(?, ?)";


    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Inserting a new record into the Database...");
        Class.forName(driverName);
        try(
                Connection con= DriverManager.getConnection(url, username, password);
                PreparedStatement ps= con.prepareStatement(query);
                ){
            ps.setInt(1, 6);
            ps.setString(2, "Shubhum");
            int rowAffected= ps.executeUpdate();
            System.out.println("Updated Rows: "+rowAffected);
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
        System.out.println("Operation Completed");
    }
}
