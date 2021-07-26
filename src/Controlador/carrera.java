/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.conexion;
import Modelo.modelo;
import Modelo.puestos;
import Vista.Carrera;
import Vista.Premiacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author Alejandro
 */
public class carrera extends Thread {
    
    private final JLabel etiqueta;
    private final Carrera corredor;
    private modelo nombre;
    private puestos puesto;
        conexion cn=new conexion();
        Connection con;
        PreparedStatement ps;   
        ResultSet rs;
    public carrera(JLabel etiqueta, Carrera corredor) {
        this.etiqueta = etiqueta;
        this.corredor = corredor;
    }
    
  
    @Override
    public void run(){
        
       
        
        int corredor1 = 0;
        int corredor2 = 0;
        int corredor3 = 0;
        Random r = new Random();
        
        
        while (true){
            
        try {
                sleep((int)(Math.random() * 1000));
                corredor1 = corredor.getcorredor1().getLocation().x;
                corredor2 = corredor.getcorredor2().getLocation().x;
                corredor3 = corredor.getcorredor3().getLocation().x;
                
                if (corredor1 < corredor.getmeta().getLocation().x - 150 && corredor2 < corredor.getmeta().getLocation().x - 150 && corredor3 < corredor.getmeta().getLocation().x - 150 ){
                etiqueta.setLocation(etiqueta.getLocation().x + r.nextInt(6)+ 1 * 100, etiqueta.getLocation().y);
                corredor.repaint();
                }else {
                
                break;
                }
        } catch(Exception e) {
            System.err.println(e);
        }
        
        if (etiqueta.getLocation().x >= corredor.getmeta().getLocation().x - 150){
        
        String sql = "select * from corredores_circuito";
        try {
            
            con=cn.getConnection();
            ps=con.prepareStatement(sql); 
           
            ps.executeQuery();
        while (rs.next()){
        Premiacion abrir = new Premiacion();
        Carrera abrir1 = new Carrera();
            if (corredor1 > corredor2 && corredor1 > corredor3 && corredor2 > corredor3){
        //1-2-3   
                guardar(rs.getString(2), rs.getString(3), rs.getString(4));
                abrir.setVisible(true);
                abrir1.setVisible(false);         
                   }else if(corredor1 > corredor2 && corredor1 > corredor3 && corredor3 > corredor2){
        //1-3-2
                guardar(rs.getString(2), rs.getString(4), rs.getString(3));
                abrir.setVisible(true);
                abrir1.setVisible(false);       
                   }else if(corredor2 > corredor1 && corredor2 > corredor3 && corredor1 > corredor3){
        //2-1-3
                guardar(rs.getString(3), rs.getString(2), rs.getString(4));
                abrir.setVisible(true);
                abrir1.setVisible(false);        
                   }else if(corredor2 > corredor1 && corredor2 > corredor3 && corredor3 > corredor1){
        //2-3-1
                guardar(rs.getString(3), rs.getString(4), rs.getString(2));
                abrir.setVisible(true);
                abrir1.setVisible(false);       
                   }else if (corredor3 > corredor2 && corredor3 > corredor1 && corredor1 > corredor2){
        //3-1-2
                guardar(rs.getString(4), rs.getString(2), rs.getString(3));
                abrir.setVisible(true);
                abrir1.setVisible(false);       
                   }else if (corredor3 > corredor2 && corredor3 > corredor1 && corredor2 > corredor1){
        //3-2-1
                guardar(rs.getString(4), rs.getString(3), rs.getString(2));
                abrir.setVisible(true);
                abrir1.setVisible(false);       
                   }
            
        }
        ps.close();
        } catch (SQLException e) {   
            
        } 
        }
        
        }
                
    }
    
    public void guardar(String primer_lugar, String segundo_lugar, String tercer_lugar){
    String sql1 = "insert into carrera (primer_lugar, segundo_lugar, tercer_lugar) values (?,?,?)";
    
    try {
            
            con=cn.getConnection();
            ps=con.prepareStatement(sql1); 
            ps.setString(1,(String) primer_lugar);
            ps.setString(2,(String) segundo_lugar);
            ps.setString(3,(String) tercer_lugar);
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException e) {
        }
       
    }
                
}
