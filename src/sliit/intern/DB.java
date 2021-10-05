package sliit.intern;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DB {
    private static Connection c;
    
    public static Connection connect() throws Exception {
        if (c == null || c.isClosed()) {
            InputStream stream = new FileInputStream("db.properties");
            Properties props = new Properties();
            props.load(stream);
            
            String url = props.getProperty("url");
            String username = props.getProperty("username");
            String password = props.getProperty("password");
            
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            c = DriverManager.getConnection(url, username, password);
        }
        return c;
    }
}
