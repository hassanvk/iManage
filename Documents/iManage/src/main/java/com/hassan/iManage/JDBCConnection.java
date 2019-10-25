package com.hassan.iManage;

import java.sql.*;

public class JDBCConnection {

    private Connection connection;

    /**
     * ConnectToDataBase connects to database using paramters and returns Connection Object
     * @param driver Driver for connecting to database
     * @param url URL for connecting to database
     * @param userName Username for connecting to database
     * @param password Password for connecting to database
     * @return
     */
    public Connection ConnectToDataBase(String driver, String url, String userName, String password) {

        try {
            //Register JDBC Driver
            Class.forName(driver);

            System.out.print("Connecting to database...");
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Successful!");

        } catch (ClassNotFoundException e) {
            System.out.println("Error " + e);
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        return connection;

    }
}
