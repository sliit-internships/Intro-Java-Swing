/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sliit.intern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.sql.DriverManager;
import java.util.Properties;

/**
 *
 * @author ACER
 */
public class DB {

    private static Connection c;
    
    public static Connection connect() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, FileNotFoundException, IOException{
        
        if (c == null || c.isClosed()) {
            InputStream i = new FileInputStream("db.properties");
            Properties props = new Properties();
            props.load(i);
            
            String url = props.getProperty("url");
            String username = props.getProperty("username");
            String password = props.getProperty("password");
            
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            c = DriverManager.getConnection(url, username, password);
        }
        return c;
        
        
    }
}
