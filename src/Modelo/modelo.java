/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alejandro
 */
public class modelo {
    
     private int circuito_no;
     private int circuito_km;
    
     private String nombre_corredor1;
     private String nombre_corredor2;
     private String nombre_corredor3;
     
   

   
    public modelo(String nombre_corredor1, String nombre_corredor2, String nombre_corredor3) {
        this.nombre_corredor1 = nombre_corredor1;
        this.nombre_corredor2 = nombre_corredor2;
        this.nombre_corredor3 = nombre_corredor3;
    }

    public String getNombre_corredor1() {
        return nombre_corredor1;
    }

    public void setNombre_corredor1(String nombre_corredor1) {
        this.nombre_corredor1 = nombre_corredor1;
    }

    public String getNombre_corredor2() {
        return nombre_corredor2;
    }

    public void setNombre_corredor2(String nombre_corredor2) {
        this.nombre_corredor2 = nombre_corredor2;
    }

    public String getNombre_corredor3() {
        return nombre_corredor3;
    }

    public void setNombre_corredor3(String nombre_corredor3) {
        this.nombre_corredor3 = nombre_corredor3;
    }

   

    public int getCircuito_no() {
        return circuito_no;
    }

    public void setCircuito_no(int circuito_no) {
        this.circuito_no = circuito_no;
    }

    public int getCircuito_km() {
        return circuito_km;
    }

    public void setCircuito_km(int circuito_km) {
        this.circuito_km = circuito_km;
    }

}