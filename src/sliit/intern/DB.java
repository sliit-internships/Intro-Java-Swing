/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sliit.intern;

import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author ACER
 */
public class DB {
    
    private static String url = "jdbc:mysql://localhost:3306/studentrecords";
    private static String username = "root";
    private static String password = "123456";

    private static Connection c;
    
    public static Connection connect() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        if (c == null || c.isClosed()) {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            c = DriverManager.getConnection(url, username, password);
        }
        return c;
        
        
    }
}
