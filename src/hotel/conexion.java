/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author cristian
 */
public class conexion {
     public static java.sql.Connection conn;
    
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String URL = "jdbc:mysql://localhost:3306/hotel?allowPublicKeyRetrieval=true&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    private static final String CLASS_DRIVER = "com.mysql.cj.jdbc.Driver";

    public static Connection getConnection() {
        try {
            Class.forName(CLASS_DRIVER).newInstance();
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Se conecto");
        } catch (Exception ex) {
            System.out.println(conexion.class.getName() + " Error al abrir la conexion");
            ex.printStackTrace();
        }
        return conn;
    }       
}
