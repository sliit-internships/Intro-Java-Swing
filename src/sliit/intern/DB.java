package sliit.intern;

import java.sql.*;

public class DB {
    private static String url = "jdbc:mysql://localhost:3306/studentrecords";
    private static String username = "root";
    private static String password = "root";

    private static Connection c;
    
    public static Connection connect() throws Exception {
        if (c == null || c.isClosed()) {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            c = DriverManager.getConnection(url, username, password);
        }
        return c;
    }
}
