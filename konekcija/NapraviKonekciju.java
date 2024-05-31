/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konekcija;

import java.sql.*;

/**
 *
 * @author stefa
 */
public class NapraviKonekciju {
    private static NapraviKonekciju instance;
    private Connection connection;

    private final String url = "jdbc:mysql://localhost:3306/projekat";
    private final String username = "root";
    private final String password = "";

    private NapraviKonekciju() {
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            System.out.println("Greska prilikom povezivanje sa bazom: " + ex.getMessage());
        }
    }

    public static NapraviKonekciju getInstance() {
        if (instance == null) {
            synchronized (NapraviKonekciju.class) {
                if (instance == null) {
                    instance = new NapraviKonekciju();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error closing the database connection: " + ex.getMessage());
        }
    }
    
    //Statement statement = connection.createStatement();
}
