/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.conexion;
import Vista.Menu_carreras;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Alejandro
 */
public class nombres_carrera extends Menu_carreras {
    
    
    conexion cn=new conexion();
    Connection con = cn.getConnection();
    PreparedStatement ps;   
    ResultSet rs;
    public void guardar(String nombre_corredor1, String nombre_corredor2, String nombre_corredor3){
    String sql = "insert into corredores_circuito (nombre_corredor1, nombre_corredor2, nombre_corredor3) values (?,?,?) ";

    try {
            
            con=cn.getConnection();
            ps=con.prepareStatement(sql); 
            ps.setString(1,(String) nombre_corredor1);
            ps.setString(2,(String) nombre_corredor2);
            ps.setString(3,(String) nombre_corredor3);
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException e) {
        }
    
    }
}
