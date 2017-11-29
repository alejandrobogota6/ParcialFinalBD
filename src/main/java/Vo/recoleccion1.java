/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vo;

/**
 *
 * @author JCBOT
 */
public class recoleccion1 {

    private String Fecha;
    private String Recolector;
    private String Colmena;
    private int Kilosdemiel;

    public recoleccion1(String Fecha, String Recolector, String Colmena, int Kilosdemiel) {
        this.Fecha = Fecha;
        this.Recolector = Recolector;
        this.Colmena = Colmena;
        this.Kilosdemiel = Kilosdemiel;
    }

    public recoleccion1() {
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getRecolector() {
        return Recolector;
    }

    public void setRecolector(String Recolector) {
        this.Recolector = Recolector;
    }

    public String getColmena() {
        return Colmena;
    }

    public void setColmena(String Colmena) {
        this.Colmena = Colmena;
    }

    public int getKilosdemiel() {
        return Kilosdemiel;
    }

    public void setKilosdemiel(int Kilosdemiel) {
        this.Kilosdemiel = Kilosdemiel;
    }


    
    

}
