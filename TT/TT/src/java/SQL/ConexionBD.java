/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author carlo
 */
public class ConexionBD {
    
    private static String url = "jdbc:sqlserver://CARLOSEMILIO;databaseName=Mediciones";
    private static final String JDBC_USER = "sa";
    private static final String JDBC_PASSWORD = "root";
    
    
    
    public static Connection conectar(){
        Connection conexion = null;
        
        try {
            Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
            conexion = DriverManager.getConnection(url, JDBC_USER, JDBC_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e);
        }
        
        return conexion;
    }

}
