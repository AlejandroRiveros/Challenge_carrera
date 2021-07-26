/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Alejandro
 */

public class conexion {
    Connection con;
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/carrera_bd","root","");
        }catch (Exception e){
    } return con;
}
}