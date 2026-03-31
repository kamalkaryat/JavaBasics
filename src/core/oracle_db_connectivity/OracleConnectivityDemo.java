package core.oracle_db_connectivity;

import java.sql.*;

public class OracleConnectivityDemo {
    private static ResultSet rs=null;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection con=null;
        Statement st=null;
        //Class.forName("oracle.jdbc.OracleDriver");
        try {
            //Connection establishment
            con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","kamal");

            //Statement creation
            if(con!=null) {
                System.out.println("Connection established");
                st=con.createStatement();
            }

            //Execution of query
            if(st!=null) {
                String query = "select * from e_info";
                rs= st.executeQuery(query);
            }

            //Displaying records
            if(rs!=null) {
                while(rs.next()) {
                    System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getDate(4));
                }
            }
        }catch (SQLException e) {
            System.out.println("Error Occurred");
        } finally {
            if(rs!=null) rs.close();
            if(st!=null) st.close();
            if(con!=null) con.close();
        }
    }
}
