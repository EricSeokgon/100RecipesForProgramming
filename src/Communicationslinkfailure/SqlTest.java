package Communicationslinkfailure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlTest {
    public static void main(String[] args) throws SQLException {
        // Class.forName( "com.mysql.jdbc.Driver" ); // do this in init
// // edit the jdbc url
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/projects?user=user1&password=123");
// Statement st = conn.createStatement();
// ResultSet rs = st.executeQuery( "select * from table" );
        System.out.println("Connected?");
    }
}
