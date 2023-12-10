package org.example.util;


import java.sql.*;

public class SqlUtils {

    private static final String url = "jdbc:mysql://localhost:3306/custom?useUnicode=true&characterEncoding=UTF-8";
    private static final String user = "root";
    private static final String password = "123456";


    public Connection getConnection() throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
    }
}
