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
public class Escuadron {

    private String nombreEscuadron;
    private String lugar;
    private String lider;
    private String HereoVillano;
    ArrayList<Persona> escuadron = new ArrayList();

    public Escuadron(String nombreEscuadron, String Lugar, String lider, String HereoVillano) {
        this.nombreEscuadron = nombreEscuadron;
        this.lugar = lugar;
        this.lider = lider;
        this.HereoVillano = HereoVillano;
    }

    public String getNombreEscuadron() {
        return nombreEscuadron;
    }

    public void setNombreEscuadron(String nombreEscuadron) {
        this.nombreEscuadron = nombreEscuadron;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String Lugar) {
        this.lugar = Lugar;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public String isHereoVillano() {
        return HereoVillano;
    }

    public void setHereoVillano(String HereoVillano) {
        this.HereoVillano = HereoVillano;
    }

    public ArrayList<Persona> getMiembros() {
        return escuadron;
    }

    public void setMiembros(ArrayList<Persona> miembros) {
        this.escuadron = miembros;
    }

    @Override
    public String toString() {
        return "Escuadron{" + "nombreEscuadron=" + nombreEscuadron + ", Lugar=" + lugar + ", lider=" + lider + ", HereoVillano=" + HereoVillano + ", miembros=" + escuadron + '}';
    }

}
