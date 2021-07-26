/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class puestos {
     private String primer_lugar;
     private String segundo_lugar;
     private String tercer_lugar;

    public String getPrimer_lugar() {
        return primer_lugar;
    }

    public void setPrimer_lugar(String primer_lugar) {
        this.primer_lugar = primer_lugar;
    }

    public String getSegundo_lugar() {
        return segundo_lugar;
    }

    public void setSegundo_lugar(String segundo_lugar) {
        this.segundo_lugar = segundo_lugar;
    }

    public String getTercer_lugar() {
        return tercer_lugar;
    }

    public void setTercer_lugar(String tercer_lugar) {
        this.tercer_lugar = tercer_lugar;
    }
     

    public puestos(String primer_lugar, String segundo_lugar, String tercer_lugar) {
        this.primer_lugar = primer_lugar;
        this.segundo_lugar = segundo_lugar;
        this.tercer_lugar = tercer_lugar;
    }
}
