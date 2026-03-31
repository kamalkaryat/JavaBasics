package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transactions_3 {
    //Credentials
    private static final String url = "jdbc:mysql://localhost:3306/jdbc_demo";
    private static final String username = "root";
    private static final  String password = "root";
    private static final String driverName= "com.mysql.cj.jdbc.Driver";
    private static final String query= "UPDATE EMPLOYEE SET NAME=? WHERE ID=?";


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("Inserting a new record into the Database...");
        Class.forName(driverName);
        Connection con = null;

        try{
            con= DriverManager.getConnection(url, username, password);
            con.setAutoCommit(false); // Start transaction

            PreparedStatement ps= con.prepareStatement(query);
            ps.setString(1, "Kamal Singh Karayat");
            ps.setInt(2, 1);
            int rowAffected= ps.executeUpdate();
            System.out.println("Updated Rows: "+rowAffected);

            con.commit();           // Commit transaction
        }catch (SQLException e){
            System.out.println("Undoing the changes");
            e.printStackTrace();
            if(con!=null) con.rollback();

        }finally {
            if(con!=null) con.close();
        }
        System.out.println("Operation Completed");
    }
}

