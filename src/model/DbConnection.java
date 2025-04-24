package model;

import java.sql.*;
import javax.swing.JOptionPane;

public class DbConnection {

    static Connection conn = null;

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_USER_NAME = "root";
    static final String DB_PASSWORD = "sql100";
    static final String DB_URL = "jdbc:mysql://localhost:3306/PayrollSystem"; // Already includes DB name

    public static Connection getDbConnection() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, DB_USER_NAME, DB_PASSWORD);
            System.out.println("connected successfully");
            return conn;

        } catch (ClassNotFoundException ex1) {
            JOptionPane.showMessageDialog(null,
                "Error! Failed to Establish Connection! Please contact your System Administrator!\n\n" + ex1.getMessage(),
                "ERROR", 0);
            return null;

        } catch (SQLException ex2) {
            JOptionPane.showMessageDialog(null,
                "Error! Failed to Establish Connection! Please contact your System Administrator!\n\n" + ex2.getMessage(),
                "ERROR", 0);
            return null;

        } catch (Exception ex3) {
            JOptionPane.showMessageDialog(null,
                "Error! Failed to Establish Connection! Please contact your System Administrator!\n\n" + ex3.getMessage(),
                "ERROR", 0);
            return null;
        }
    }
}
