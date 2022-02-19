/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1labprograii;

import java.util.ArrayList;

/**
 *
 * @author xavie
 */
public class Universo {
    private String nombre;
    ArrayList<Escuadron>squads=new ArrayList();

    public Universo(String nombre) {
        this.nombre = nombre;
    }

    Universo(String nombreEscuadron, String HereoVillano, String lider, String lugar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Escuadron> getSquads() {
        return squads;
    }

    public void setSquads(ArrayList<Escuadron> squads) {
        this.squads = squads;
    }

    @Override
    public String toString() {
        return "Universo{" + "nombre=" + nombre + ", squads=" + squads + '}';
    }
    
    
    
    
}
